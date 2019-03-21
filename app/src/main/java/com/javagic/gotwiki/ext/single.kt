package com.javagic.gotwiki.ext

import io.reactivex.Single
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers


fun <T> Single<T>.subscribeOnIo() = subscribeOn(Schedulers.io())
fun <T> Single<T>.observeOnMainThread() = observeOn(AndroidSchedulers.mainThread())
fun <T> Single<T>.observeOnIo() = observeOn(Schedulers.io())