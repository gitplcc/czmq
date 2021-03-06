/*
################################################################################
#  THIS FILE IS 100% GENERATED BY ZPROJECT; DO NOT EDIT EXCEPT EXPERIMENTALLY  #
#  Read the zproject/README.md for information about making permanent changes. #
################################################################################
*/
package org.zeromq.czmq;

import org.zeromq.tools.ZmqNativeLoader;

public class Zdigest implements AutoCloseable {
    static {
        ZmqNativeLoader.loadLibrary("zmq", true);
        ZmqNativeLoader.loadLibrary("uuid", true);
        ZmqNativeLoader.loadLibrary("libsystemd", true);
        ZmqNativeLoader.loadLibrary("lz4", true);
        ZmqNativeLoader.loadLibrary("curl", true);
        ZmqNativeLoader.loadLibrary("microhttpd", true);
        ZmqNativeLoader.loadLibrary("czmq", true);
        ZmqNativeLoader.loadLibrary("czmqjni", false);
    }
    public long self;
    /*
    Constructor - creates new digest object, which you use to build up a
    digest by repeatedly calling zdigest_update() on chunks of data.
    */
    native static long __new ();
    public Zdigest () {
        /*  TODO: if __new fails, self is null...            */
        self = __new ();
    }
    public Zdigest (long pointer) {
        self = pointer;
    }
    /*
    Destroy a digest object
    */
    native static void __destroy (long self);
    @Override
    public void close () {
        __destroy (self);
        self = 0;
    }
    /*
    Add buffer into digest calculation
    */
    native static void __update (long self, byte [] buffer, long length);
    public void update (byte [] buffer, long length) {
        __update (self, buffer, length);
    }
    /*
    Return final digest hash data. If built without crypto support,
    returns NULL.
    */
    native static byte [] __data (long self);
    public byte [] data () {
        return __data (self);
    }
    /*
    Return final digest hash size
    */
    native static long __size (long self);
    public long size () {
        return __size (self);
    }
    /*
    Return digest as printable hex string; caller should not modify nor
    free this string. After calling this, you may not use zdigest_update()
    on the same digest. If built without crypto support, returns NULL.
    */
    native static String __string (long self);
    public String string () {
        return __string (self);
    }
    /*
    Self test of this class.
    */
    native static void __test (boolean verbose);
    public static void test (boolean verbose) {
        __test (verbose);
    }
}
