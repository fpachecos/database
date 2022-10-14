# Define the commandline invocation of Maven if necessary:
ifeq ($(MVN),)
    MVN  := mvn
endif

ifeq ($(GIT),)
    GIT  := git
endif

ifeq ($(RELEASE_VERSION),)
    RELEASE_VERSION  := $(shell xmllint --xpath "/*[local-name() = 'project']/*[local-name() = 'version']/text()" pom.xml | perl -pe 's/-SNAPSHOT//')
endif

package:
	$(MVN) package

release-preapare: package
	$(MVN) release:prepare

release-perform: release-preapare
	$(MVN) release:perform

release-version:
	@echo $(RELEASE_VERSION)