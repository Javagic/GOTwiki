package com.javagic.domain.gotusecases

import com.javagic.gotwiki.ext.observeOnMainThread
import com.javagic.gotwiki.ext.subscribeOnIo
import io.reactivex.Single

abstract class UseCase<out Type, in Params>() where Type : kotlin.Any {
    internal abstract fun run(params: Params?): Single<out Type>

    operator fun invoke(params: Params) =
        run(params)
            .subscribeOnIo()
            .observeOnMainThread()

    class None
}