# A simple Java CDI Example

An example of how to inject a managed bean into a JAX-RS resource *(verified with Java 1.8.0_66 and Maven 3.3.3)*.

    $ mvn clean install wildfly:run
    $ curl -i http://localhost:8080/cdi_example/objects

### References:

 * [https://docs.oracle.com/javaee/6/tutorial/doc/gjbnr.html]()
 * [http://docs.jboss.org/weld/reference/latest/en-US/html/beanscdi.html]()
