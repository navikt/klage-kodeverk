FROM gcr.io/distroless/java17-debian12:nonroot
ENV TZ="Europe/Oslo"

COPY build/libs/app.jar /app/app.jar
WORKDIR /app
CMD ["app.jar"]