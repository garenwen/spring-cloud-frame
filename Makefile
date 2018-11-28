clean:
	./mvnw clean

package:
	./mvnw package

build-image:
	./mvnw install dockerfile:build

.PHONY: docker-build clean package
