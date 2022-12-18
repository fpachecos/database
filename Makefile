# Define the commandline invocation of Maven if necessary:
ifeq ($(MVN),)
    MVN  := mvn
endif

ifeq ($(GIT),)
    GIT  := git
endif

clean:
	$(MVN) clean

install: clean
	$(MVN) install -DskipTests

prepare-package: install	
	ren .\target\database*.jar database.jar

docker-build: prepare-package
	 - docker image rm database:latest
	docker build --pull --rm -f "Dockerfile" -t database:latest .