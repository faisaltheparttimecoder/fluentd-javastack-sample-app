# Fluent Java Stack Complex Spring Webflux Stack

This is a simple Spring Webflux application that generates Webflux Java stack when called i.e it prints complex webflux Java stack on the screen. This app can be used to test the Fluentd multiline regex functionality.

### `throwException` Endpoint

When calling the `throwException` endpoint, the program generates a Java error in the following format:

```
2023-05-08 21:46:10.456 ERROR 83677 --- [ctor-http-nio-2] a.w.r.e.AbstractErrorWebExceptionHandler : [6c908f97-1]  500 Server Error for HTTP GET "/throwException"

org.springframework.web.reactive.function.client.WebClientRequestException: Failed to resolve 'non-existing-server' [A(1), AAAA(28)] after 6 queries ; nested exception is java.net.UnknownHostException: Failed to resolve 'non-existing-server' [A(1), AAAA(28)] after 6 queries 
        at org.springframework.web.reactive.function.client.ExchangeFunctions$DefaultExchangeFunction.lambda$wrapException$9(ExchangeFunctions.java:141) ~[spring-webflux-5.3.27.jar:5.3.27]
        Suppressed: reactor.core.publisher.FluxOnAssembly$OnAssemblyException: 
Error has been observed at the following site(s):
        *__checkpoint ⇢ Request to GET null [DefaultWebClient]
        *__checkpoint ⇢ Handler com.self.javastackcomplexspringwebflux.JavaStackComplexSpringWebfluxApplication#hello() [DispatcherHandler]
        *__checkpoint ⇢ HTTP GET "/throwException" [ExceptionHandlingWebHandler]
Original Stack Trace:
                at org.springframework.web.reactive.function.client.ExchangeFunctions$DefaultExchangeFunction.lambda$wrapException$9(ExchangeFunctions.java:141) ~[spring-webflux-5.3.27.jar:5.3.27]
                at reactor.core.publisher.MonoErrorSupplied.subscribe(MonoErrorSupplied.java:55) ~[reactor-core-3.4.29.jar:3.4.29]
                at reactor.core.publisher.Mono.subscribe(Mono.java:4490) ~[reactor-core-3.4.29.jar:3.4.29]
                at reactor.core.publisher.FluxOnErrorResume$ResumeSubscriber.onError(FluxOnErrorResume.java:103) ~[reactor-core-3.4.29.jar:3.4.29]
                at reactor.core.publisher.FluxPeek$PeekSubscriber.onError(FluxPeek.java:222) ~[reactor-core-3.4.29.jar:3.4.29]
                at reactor.core.publisher.FluxPeek$PeekSubscriber.onError(FluxPeek.java:222) ~[reactor-core-3.4.29.jar:3.4.29]
                at reactor.core.publisher.FluxPeek$PeekSubscriber.onError(FluxPeek.java:222) ~[reactor-core-3.4.29.jar:3.4.29]
                at reactor.core.publisher.MonoNext$NextSubscriber.onError(MonoNext.java:93) ~[reactor-core-3.4.29.jar:3.4.29]
                at reactor.core.publisher.MonoFlatMapMany$FlatMapManyMain.onError(MonoFlatMapMany.java:204) ~[reactor-core-3.4.29.jar:3.4.29]
                at reactor.core.publisher.SerializedSubscriber.onError(SerializedSubscriber.java:124) ~[reactor-core-3.4.29.jar:3.4.29]
                at reactor.core.publisher.FluxRetryWhen$RetryWhenMainSubscriber.whenError(FluxRetryWhen.java:225) ~[reactor-core-3.4.29.jar:3.4.29]
                at reactor.core.publisher.FluxRetryWhen$RetryWhenOtherSubscriber.onError(FluxRetryWhen.java:274) ~[reactor-core-3.4.29.jar:3.4.29]
                at reactor.core.publisher.FluxContextWrite$ContextWriteSubscriber.onError(FluxContextWrite.java:121) ~[reactor-core-3.4.29.jar:3.4.29]
                at reactor.core.publisher.FluxConcatMap$ConcatMapImmediate.drain(FluxConcatMap.java:415) ~[reactor-core-3.4.29.jar:3.4.29]
                at reactor.core.publisher.FluxConcatMap$ConcatMapImmediate.onNext(FluxConcatMap.java:251) ~[reactor-core-3.4.29.jar:3.4.29]
                at reactor.core.publisher.FluxContextWrite$ContextWriteSubscriber.onNext(FluxContextWrite.java:107) ~[reactor-core-3.4.29.jar:3.4.29]
                at reactor.core.publisher.EmitterProcessor.drain(EmitterProcessor.java:537) ~[reactor-core-3.4.29.jar:3.4.29]
                at reactor.core.publisher.EmitterProcessor.tryEmitNext(EmitterProcessor.java:343) ~[reactor-core-3.4.29.jar:3.4.29]
                at reactor.core.publisher.SinkManySerialized.tryEmitNext(SinkManySerialized.java:100) ~[reactor-core-3.4.29.jar:3.4.29]
                at reactor.core.publisher.InternalManySink.emitNext(InternalManySink.java:27) ~[reactor-core-3.4.29.jar:3.4.29]
                at reactor.core.publisher.FluxRetryWhen$RetryWhenMainSubscriber.onError(FluxRetryWhen.java:190) ~[reactor-core-3.4.29.jar:3.4.29]
                at reactor.core.publisher.MonoCreate$DefaultMonoSink.error(MonoCreate.java:201) ~[reactor-core-3.4.29.jar:3.4.29]
                at reactor.netty.http.client.HttpClientConnect$MonoHttpConnect$ClientTransportSubscriber.onError(HttpClientConnect.java:311) ~[reactor-netty-http-1.0.31.jar:1.0.31]
                at reactor.core.publisher.MonoCreate$DefaultMonoSink.error(MonoCreate.java:201) ~[reactor-core-3.4.29.jar:3.4.29]
                at reactor.netty.resources.DefaultPooledConnectionProvider$DisposableAcquire.onError(DefaultPooledConnectionProvider.java:160) ~[reactor-netty-core-1.0.31.jar:1.0.31]
                at reactor.core.publisher.FluxContextWrite$ContextWriteSubscriber.onError(FluxContextWrite.java:121) ~[reactor-core-3.4.29.jar:3.4.29]
                at reactor.netty.internal.shaded.reactor.pool.AbstractPool$Borrower.fail(AbstractPool.java:475) ~[reactor-netty-core-1.0.31.jar:1.0.31]
                at reactor.netty.internal.shaded.reactor.pool.SimpleDequePool.lambda$drainLoop$9(SimpleDequePool.java:431) ~[reactor-netty-core-1.0.31.jar:1.0.31]
                at reactor.core.publisher.FluxDoOnEach$DoOnEachSubscriber.onError(FluxDoOnEach.java:186) ~[reactor-core-3.4.29.jar:3.4.29]
                at reactor.core.publisher.MonoCreate$DefaultMonoSink.error(MonoCreate.java:201) ~[reactor-core-3.4.29.jar:3.4.29]
                at reactor.netty.resources.DefaultPooledConnectionProvider$PooledConnectionAllocator$PooledConnectionInitializer.onError(DefaultPooledConnectionProvider.java:558) ~[reactor-netty-core-1.0.31.jar:1.0.31]
                at reactor.core.publisher.MonoFlatMap$FlatMapMain.secondError(MonoFlatMap.java:192) ~[reactor-core-3.4.29.jar:3.4.29]
                at reactor.core.publisher.MonoFlatMap$FlatMapInner.onError(MonoFlatMap.java:259) ~[reactor-core-3.4.29.jar:3.4.29]
                at reactor.core.publisher.FluxOnErrorResume$ResumeSubscriber.onError(FluxOnErrorResume.java:106) ~[reactor-core-3.4.29.jar:3.4.29]
                at reactor.core.publisher.Operators.error(Operators.java:198) ~[reactor-core-3.4.29.jar:3.4.29]
                at reactor.core.publisher.MonoError.subscribe(MonoError.java:53) ~[reactor-core-3.4.29.jar:3.4.29]
                at reactor.core.publisher.Mono.subscribe(Mono.java:4490) ~[reactor-core-3.4.29.jar:3.4.29]
                at reactor.core.publisher.FluxOnErrorResume$ResumeSubscriber.onError(FluxOnErrorResume.java:103) ~[reactor-core-3.4.29.jar:3.4.29]
                at reactor.netty.transport.TransportConnector$MonoChannelPromise.tryFailure(TransportConnector.java:580) ~[reactor-netty-core-1.0.31.jar:1.0.31]
                at reactor.netty.transport.TransportConnector.lambda$doResolveAndConnect$11(TransportConnector.java:387) ~[reactor-netty-core-1.0.31.jar:1.0.31]
                at io.netty.util.concurrent.DefaultPromise.notifyListener0(DefaultPromise.java:590) ~[netty-common-4.1.91.Final.jar:4.1.91.Final]
                at io.netty.util.concurrent.DefaultPromise.notifyListenersNow(DefaultPromise.java:557) ~[netty-common-4.1.91.Final.jar:4.1.91.Final]
                at io.netty.util.concurrent.DefaultPromise.notifyListeners(DefaultPromise.java:492) ~[netty-common-4.1.91.Final.jar:4.1.91.Final]
                at io.netty.util.concurrent.DefaultPromise.setValue0(DefaultPromise.java:636) ~[netty-common-4.1.91.Final.jar:4.1.91.Final]
                at io.netty.util.concurrent.DefaultPromise.setFailure0(DefaultPromise.java:629) ~[netty-common-4.1.91.Final.jar:4.1.91.Final]
                at io.netty.util.concurrent.DefaultPromise.setFailure(DefaultPromise.java:110) ~[netty-common-4.1.91.Final.jar:4.1.91.Final]
                at io.netty.resolver.InetSocketAddressResolver$2.operationComplete(InetSocketAddressResolver.java:86) ~[netty-resolver-4.1.91.Final.jar:4.1.91.Final]
                at io.netty.util.concurrent.DefaultPromise.notifyListener0(DefaultPromise.java:590) ~[netty-common-4.1.91.Final.jar:4.1.91.Final]
                at io.netty.util.concurrent.DefaultPromise.notifyListeners0(DefaultPromise.java:583) ~[netty-common-4.1.91.Final.jar:4.1.91.Final]
                at io.netty.util.concurrent.DefaultPromise.notifyListenersNow(DefaultPromise.java:559) ~[netty-common-4.1.91.Final.jar:4.1.91.Final]
                at io.netty.util.concurrent.DefaultPromise.notifyListeners(DefaultPromise.java:492) ~[netty-common-4.1.91.Final.jar:4.1.91.Final]
                at io.netty.util.concurrent.DefaultPromise.setValue0(DefaultPromise.java:636) ~[netty-common-4.1.91.Final.jar:4.1.91.Final]
                at io.netty.util.concurrent.DefaultPromise.setFailure0(DefaultPromise.java:629) ~[netty-common-4.1.91.Final.jar:4.1.91.Final]
                at io.netty.util.concurrent.DefaultPromise.tryFailure(DefaultPromise.java:118) ~[netty-common-4.1.91.Final.jar:4.1.91.Final]
                at io.netty.resolver.dns.DnsResolveContext.finishResolve(DnsResolveContext.java:1096) ~[netty-resolver-dns-4.1.91.Final.jar:4.1.91.Final]
                at io.netty.resolver.dns.DnsResolveContext.tryToFinishResolve(DnsResolveContext.java:1035) ~[netty-resolver-dns-4.1.91.Final.jar:4.1.91.Final]
                at io.netty.resolver.dns.DnsResolveContext.query(DnsResolveContext.java:422) ~[netty-resolver-dns-4.1.91.Final.jar:4.1.91.Final]
                at io.netty.resolver.dns.DnsResolveContext.onResponse(DnsResolveContext.java:655) ~[netty-resolver-dns-4.1.91.Final.jar:4.1.91.Final]
                at io.netty.resolver.dns.DnsResolveContext.access$500(DnsResolveContext.java:66) ~[netty-resolver-dns-4.1.91.Final.jar:4.1.91.Final]
                at io.netty.resolver.dns.DnsResolveContext$2.operationComplete(DnsResolveContext.java:482) ~[netty-resolver-dns-4.1.91.Final.jar:4.1.91.Final]
                at io.netty.util.concurrent.DefaultPromise.notifyListener0(DefaultPromise.java:590) ~[netty-common-4.1.91.Final.jar:4.1.91.Final]
                at io.netty.util.concurrent.DefaultPromise.notifyListeners0(DefaultPromise.java:583) ~[netty-common-4.1.91.Final.jar:4.1.91.Final]
                at io.netty.util.concurrent.DefaultPromise.notifyListenersNow(DefaultPromise.java:559) ~[netty-common-4.1.91.Final.jar:4.1.91.Final]
                at io.netty.util.concurrent.DefaultPromise.notifyListeners(DefaultPromise.java:492) ~[netty-common-4.1.91.Final.jar:4.1.91.Final]
                at io.netty.util.concurrent.DefaultPromise.setValue0(DefaultPromise.java:636) ~[netty-common-4.1.91.Final.jar:4.1.91.Final]
                at io.netty.util.concurrent.DefaultPromise.setSuccess0(DefaultPromise.java:625) ~[netty-common-4.1.91.Final.jar:4.1.91.Final]
                at io.netty.util.concurrent.DefaultPromise.trySuccess(DefaultPromise.java:105) ~[netty-common-4.1.91.Final.jar:4.1.91.Final]
                at io.netty.resolver.dns.DnsQueryContext.trySuccess(DnsQueryContext.java:232) ~[netty-resolver-dns-4.1.91.Final.jar:4.1.91.Final]
                at io.netty.resolver.dns.DnsQueryContext.finish(DnsQueryContext.java:224) ~[netty-resolver-dns-4.1.91.Final.jar:4.1.91.Final]
                at io.netty.resolver.dns.DnsNameResolver$DnsResponseHandler.channelRead(DnsNameResolver.java:1364) ~[netty-resolver-dns-4.1.91.Final.jar:4.1.91.Final]
                at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:444) ~[netty-transport-4.1.91.Final.jar:4.1.91.Final]
                at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:420) ~[netty-transport-4.1.91.Final.jar:4.1.91.Final]
                at io.netty.channel.AbstractChannelHandlerContext.fireChannelRead(AbstractChannelHandlerContext.java:412) ~[netty-transport-4.1.91.Final.jar:4.1.91.Final]
                at io.netty.handler.codec.MessageToMessageDecoder.channelRead(MessageToMessageDecoder.java:103) ~[netty-codec-4.1.91.Final.jar:4.1.91.Final]
                at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:444) ~[netty-transport-4.1.91.Final.jar:4.1.91.Final]
                at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:420) ~[netty-transport-4.1.91.Final.jar:4.1.91.Final]
                at io.netty.channel.AbstractChannelHandlerContext.fireChannelRead(AbstractChannelHandlerContext.java:412) ~[netty-transport-4.1.91.Final.jar:4.1.91.Final]
                at io.netty.channel.DefaultChannelPipeline$HeadContext.channelRead(DefaultChannelPipeline.java:1410) ~[netty-transport-4.1.91.Final.jar:4.1.91.Final]
                at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:440) ~[netty-transport-4.1.91.Final.jar:4.1.91.Final]
                at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:420) ~[netty-transport-4.1.91.Final.jar:4.1.91.Final]
                at io.netty.channel.DefaultChannelPipeline.fireChannelRead(DefaultChannelPipeline.java:919) ~[netty-transport-4.1.91.Final.jar:4.1.91.Final]
                at io.netty.channel.nio.AbstractNioMessageChannel$NioMessageUnsafe.read(AbstractNioMessageChannel.java:97) ~[netty-transport-4.1.91.Final.jar:4.1.91.Final]
                at io.netty.channel.nio.NioEventLoop.processSelectedKey(NioEventLoop.java:788) ~[netty-transport-4.1.91.Final.jar:4.1.91.Final]
                at io.netty.channel.nio.NioEventLoop.processSelectedKeysOptimized(NioEventLoop.java:724) ~[netty-transport-4.1.91.Final.jar:4.1.91.Final]
                at io.netty.channel.nio.NioEventLoop.processSelectedKeys(NioEventLoop.java:650) ~[netty-transport-4.1.91.Final.jar:4.1.91.Final]
                at io.netty.channel.nio.NioEventLoop.run(NioEventLoop.java:562) ~[netty-transport-4.1.91.Final.jar:4.1.91.Final]
                at io.netty.util.concurrent.SingleThreadEventExecutor$4.run(SingleThreadEventExecutor.java:997) ~[netty-common-4.1.91.Final.jar:4.1.91.Final]
                at io.netty.util.internal.ThreadExecutorMap$2.run(ThreadExecutorMap.java:74) ~[netty-common-4.1.91.Final.jar:4.1.91.Final]
                at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30) ~[netty-common-4.1.91.Final.jar:4.1.91.Final]
                at java.lang.Thread.run(Thread.java:748) ~[na:1.8.0_275]
Caused by: java.net.UnknownHostException: Failed to resolve 'non-existing-server' [A(1), AAAA(28)] after 6 queries 
        at io.netty.resolver.dns.DnsResolveContext.finishResolve(DnsResolveContext.java:1088) ~[netty-resolver-dns-4.1.91.Final.jar:4.1.91.Final]
        at io.netty.resolver.dns.DnsResolveContext.tryToFinishResolve(DnsResolveContext.java:1035) ~[netty-resolver-dns-4.1.91.Final.jar:4.1.91.Final]
        at io.netty.resolver.dns.DnsResolveContext.query(DnsResolveContext.java:422) ~[netty-resolver-dns-4.1.91.Final.jar:4.1.91.Final]
        at io.netty.resolver.dns.DnsResolveContext.onResponse(DnsResolveContext.java:655) ~[netty-resolver-dns-4.1.91.Final.jar:4.1.91.Final]
        at io.netty.resolver.dns.DnsResolveContext.access$500(DnsResolveContext.java:66) ~[netty-resolver-dns-4.1.91.Final.jar:4.1.91.Final]
        at io.netty.resolver.dns.DnsResolveContext$2.operationComplete(DnsResolveContext.java:482) ~[netty-resolver-dns-4.1.91.Final.jar:4.1.91.Final]
        at io.netty.util.concurrent.DefaultPromise.notifyListener0(DefaultPromise.java:590) ~[netty-common-4.1.91.Final.jar:4.1.91.Final]
        at io.netty.util.concurrent.DefaultPromise.notifyListeners0(DefaultPromise.java:583) ~[netty-common-4.1.91.Final.jar:4.1.91.Final]
        at io.netty.util.concurrent.DefaultPromise.notifyListenersNow(DefaultPromise.java:559) ~[netty-common-4.1.91.Final.jar:4.1.91.Final]
        at io.netty.util.concurrent.DefaultPromise.notifyListeners(DefaultPromise.java:492) ~[netty-common-4.1.91.Final.jar:4.1.91.Final]
        at io.netty.util.concurrent.DefaultPromise.setValue0(DefaultPromise.java:636) ~[netty-common-4.1.91.Final.jar:4.1.91.Final]
        at io.netty.util.concurrent.DefaultPromise.setSuccess0(DefaultPromise.java:625) ~[netty-common-4.1.91.Final.jar:4.1.91.Final]
        at io.netty.util.concurrent.DefaultPromise.trySuccess(DefaultPromise.java:105) ~[netty-common-4.1.91.Final.jar:4.1.91.Final]
        at io.netty.resolver.dns.DnsQueryContext.trySuccess(DnsQueryContext.java:232) ~[netty-resolver-dns-4.1.91.Final.jar:4.1.91.Final]
        at io.netty.resolver.dns.DnsQueryContext.finish(DnsQueryContext.java:224) ~[netty-resolver-dns-4.1.91.Final.jar:4.1.91.Final]
        at io.netty.resolver.dns.DnsNameResolver$DnsResponseHandler.channelRead(DnsNameResolver.java:1364) ~[netty-resolver-dns-4.1.91.Final.jar:4.1.91.Final]
        at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:444) ~[netty-transport-4.1.91.Final.jar:4.1.91.Final]
        at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:420) ~[netty-transport-4.1.91.Final.jar:4.1.91.Final]
        at io.netty.channel.AbstractChannelHandlerContext.fireChannelRead(AbstractChannelHandlerContext.java:412) ~[netty-transport-4.1.91.Final.jar:4.1.91.Final]
        at io.netty.handler.codec.MessageToMessageDecoder.channelRead(MessageToMessageDecoder.java:103) ~[netty-codec-4.1.91.Final.jar:4.1.91.Final]
        at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:444) ~[netty-transport-4.1.91.Final.jar:4.1.91.Final]
        at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:420) ~[netty-transport-4.1.91.Final.jar:4.1.91.Final]
        at io.netty.channel.AbstractChannelHandlerContext.fireChannelRead(AbstractChannelHandlerContext.java:412) ~[netty-transport-4.1.91.Final.jar:4.1.91.Final]
        at io.netty.channel.DefaultChannelPipeline$HeadContext.channelRead(DefaultChannelPipeline.java:1410) ~[netty-transport-4.1.91.Final.jar:4.1.91.Final]
        at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:440) ~[netty-transport-4.1.91.Final.jar:4.1.91.Final]
        at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:420) ~[netty-transport-4.1.91.Final.jar:4.1.91.Final]
        at io.netty.channel.DefaultChannelPipeline.fireChannelRead(DefaultChannelPipeline.java:919) ~[netty-transport-4.1.91.Final.jar:4.1.91.Final]
        at io.netty.channel.nio.AbstractNioMessageChannel$NioMessageUnsafe.read(AbstractNioMessageChannel.java:97) ~[netty-transport-4.1.91.Final.jar:4.1.91.Final]
        at io.netty.channel.nio.NioEventLoop.processSelectedKey(NioEventLoop.java:788) ~[netty-transport-4.1.91.Final.jar:4.1.91.Final]
        at io.netty.channel.nio.NioEventLoop.processSelectedKeysOptimized(NioEventLoop.java:724) ~[netty-transport-4.1.91.Final.jar:4.1.91.Final]
        at io.netty.channel.nio.NioEventLoop.processSelectedKeys(NioEventLoop.java:650) ~[netty-transport-4.1.91.Final.jar:4.1.91.Final]
        at io.netty.channel.nio.NioEventLoop.run(NioEventLoop.java:562) ~[netty-transport-4.1.91.Final.jar:4.1.91.Final]
        at io.netty.util.concurrent.SingleThreadEventExecutor$4.run(SingleThreadEventExecutor.java:997) ~[netty-common-4.1.91.Final.jar:4.1.91.Final]
        at io.netty.util.internal.ThreadExecutorMap$2.run(ThreadExecutorMap.java:74) ~[netty-common-4.1.91.Final.jar:4.1.91.Final]
        at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30) ~[netty-common-4.1.91.Final.jar:4.1.91.Final]
        at java.lang.Thread.run(Thread.java:748) ~[na:1.8.0_275]
```

### Running the Program

To run this program, use the following command:

```
./mvnw clean spring-boot:run
```

### Building the Package

To build the package, use the following commands:

```
./mvnw clean install
./mvnw clean package
java -jar target/java-stack-complex-spring-webflux-0.0.1-SNAPSHOT.jar
```

### Pushing to Docker

To push the package to Docker, follow these steps:

```
docker build --no-cache -t myorg/myorg .
docker run -p8080:8000 myorg/myorg
docker images
docker tag <image id> myorg/myorg:<tag>
docker push myorg/myorg:<tag>
```

Note that `myorg/myorg`, `<tag>` and `<image id>` should be replaced with the username/imagename, tag and image ID respectively.