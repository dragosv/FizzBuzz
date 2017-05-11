FROM gradle:latest

ENV MAX_NUMBER=1000

ADD app app
COPY build.gradle settings.gradle ./

RUN gradle build
WORKDIR build/distributions

RUN tar -xf FizzBuzz-1.0.tar FizzBuzz-1.0
CMD java -jar FizzBuzz-1.0/lib/FizzBuzz-1.0.jar $MAX_NUMBER
