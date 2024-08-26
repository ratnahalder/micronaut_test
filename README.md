## Running Tests

To generate the error, run the `com.example.TestGetSpec` test class.

## Error message
The following error message is coming from the cleanupSpec() function.

Connect Error: Cannot send HTTPS request. SSL is disabled
io.micronaut.http.client.exceptions.HttpClientException: Connect Error: Cannot send HTTPS request. SSL is disabled
    at app//io.micronaut.http.client.netty.ConnectionManager$Pool.onNewConnectionFailure(ConnectionManager.java:986)
    at app//io.micronaut.http.client.netty.PoolResizer.doSomeWork(PoolResizer.java:157)
    at app//io.micronaut.http.client.netty.PoolResizer.dirty(PoolResizer.java:77)
    at app//io.micronaut.http.client.netty.PoolResizer.addPendingRequest(PoolResizer.java:233)
    at app//io.micronaut.http.client.netty.ConnectionManager$Pool.acquire(ConnectionManager.java:965)
    at app//io.micronaut.http.client.netty.ConnectionManager.connect(ConnectionManager.java:430)
    at app//io.micronaut.http.client.netty.DefaultHttpClient.exchangeImpl(DefaultHttpClient.java:1113)
    at app//io.micronaut.http.client.netty.DefaultHttpClient.lambda$exchange$8(DefaultHttpClient.java:811)
    at app//reactor.core.publisher.FluxFlatMap.trySubscribeScalarMap(FluxFlatMap.java:152)
    at app//reactor.core.publisher.FluxSwitchMapNoPrefetch.subscribeOrReturn(FluxSwitchMapNoPrefetch.java:61)
    at app//reactor.core.publisher.Flux.subscribe(Flux.java:8759)
    at app//reactor.core.publisher.Flux.blockFirst(Flux.java:2703)
    at app//io.micronaut.http.client.netty.DefaultHttpClient$1.exchange(DefaultHttpClient.java:547)
    at app//io.micronaut.http.client.BlockingHttpClient.exchange(BlockingHttpClient.java:77)
    at app//io.micronaut.http.client.BlockingHttpClient.exchange(BlockingHttpClient.java:106)
    at app//com.example.TestGetSpec.cleanupSpec(TestGETSpec.groovy:30)
