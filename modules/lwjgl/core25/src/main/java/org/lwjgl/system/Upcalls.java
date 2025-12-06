/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.system;

import org.jspecify.annotations.*;
import org.lwjgl.system.ffm.*;

import java.lang.foreign.*;
import java.lang.invoke.*;
import java.util.concurrent.*;
import java.util.function.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.ffm.FFM.*;

/** FFM backend for upcalls. */
final class Upcalls {

    private static final ConcurrentHashMap<Class<?>, Class<?>>        CALLBACK_INTERFACE_CACHE = new ConcurrentHashMap<>();
    private static final ConcurrentHashMap<Class<?>, UpcallBinder<?>> BINDER_CACHE             = new ConcurrentHashMap<>();

    private record Upcall(
        Arena arena,
        Object javaCallback
    ) { }

    private static final ConcurrentHashMap<Long, Upcall> UPCALL_REGISTRY = new ConcurrentHashMap<>();

    private enum ArenaType {
        AUTO {
            @Override Arena create() { return Arena.ofAuto(); }
            @Override boolean isCloseable() { return false; }
        },
        CONFINED {
            @Override Arena create() { return Arena.ofConfined(); }
            @Override boolean isCloseable() { return true; }
        },
        SHARED {
            @Override Arena create() { return Arena.ofShared(); }
            @Override boolean isCloseable() { return true; }
        };

        abstract Arena create();
        abstract boolean isCloseable();
    }

    private static final ArenaType ARENA_TYPE = switch (Configuration.FFM_UPCALL_ARENA.get("auto")) {
        case "auto" -> ArenaType.AUTO;
        case "confined" -> ArenaType.CONFINED;
        case "shared" -> ArenaType.SHARED;
        default -> throw new IllegalArgumentException("Unsupported arena type specified: " + Configuration.FFM_UPCALL_ARENA.get());
    };

    static {
        apiLog("Upcall Arena: " + ARENA_TYPE.name().toLowerCase());
        apiLog("Upcall Registry: ConcurrentHashMap");

        MemoryUtil.getAllocator();
    }

    private Upcalls() {
    }

    static long upcallCreate(Callback.Descriptor callbackDescriptor, Object instance) {
        var binder = getBinder(callbackDescriptor, instance);

        var descriptor = binder.descriptor();

        var scopedArena = ffmScopedArena();
        var arena = scopedArena.isBound()
            ? scopedArena.get()
            : ARENA_TYPE.create();

        var handle = binder
            .handle()
            .bindTo(instance);

        var stack = binder.stack();
        if (stack != null) {
            handle = handle.bindTo(arena.allocate(stack));
        }

        if (Configuration.FFM_UPCALL_EXCEPTION_CATCH.get(true)) {
            handle = MethodHandles.catchException(handle, Throwable.class, wrapException(descriptor));
        }

        //long t = System.nanoTime();

        var upcall = Linker.nativeLinker()
            .upcallStub(
                handle,
                descriptor,
                arena
            );

        //t = System.nanoTime() - t;
        //System.err.println(t);

        UPCALL_REGISTRY.put(upcall.address(), new Upcall(arena, instance));

        return upcall.address();
    }

    @SuppressWarnings("unchecked")
    static <T extends CallbackI> T upcallGet(long functionPointer) {
        return (T)UPCALL_REGISTRY.get(functionPointer).javaCallback;
    }

    static void upcallFree(long functionPointer) {
        var upcall = UPCALL_REGISTRY.remove(functionPointer);
        if (upcall != null && ARENA_TYPE.isCloseable()) {
            upcall.arena.close();
        }
    }

    @SuppressWarnings("rawtypes")
    private static UpcallBinder getBinder(Callback.Descriptor descriptor, Object instance) {
        // mapping from callback implementation to callback interface
        var upcallInterface = CALLBACK_INTERFACE_CACHE
            .computeIfAbsent(instance.getClass(), it -> {
                out:
                while (true) {
                    if (it.isHidden() || !it.isAnonymousClass()) {
                        for (var iface : it.getInterfaces()) {
                            if (CallbackI.class.isAssignableFrom(iface)) {
                                it = iface;
                                break out;
                            }
                        }
                    }
                    it = it.getSuperclass();
                }

                if (!it.isInterface()) {
                    throw new IllegalStateException("Failed to find upcall interface for " + instance.getClass());
                }

                return it;
            });

        // mapping from callback interface to upcall binder
        return BINDER_CACHE
            .computeIfAbsent(upcallInterface, it -> {
                ffmConfig(it, ffmConfigBuilder(descriptor.lookup)
                    .build());

                return ffmUpcall(it, descriptor.cif);
            });
    }

    // EXCEPTION WRAPPERS

    private static final MethodHandle WRAP_EXCEPTION_V;
    private static final MethodHandle WRAP_EXCEPTION_B;
    private static final MethodHandle WRAP_EXCEPTION_S;
    private static final MethodHandle WRAP_EXCEPTION_I;
    private static final MethodHandle WRAP_EXCEPTION_J;
    private static final MethodHandle WRAP_EXCEPTION_F;
    private static final MethodHandle WRAP_EXCEPTION_D;
    private static final MethodHandle WRAP_EXCEPTION_A;

    static {
        var lookup = MethodHandles.lookup();

        try {
            WRAP_EXCEPTION_V = lookup.findStatic(Upcalls.class, "wrapExceptionV", MethodType.methodType(void.class, Throwable.class));
            WRAP_EXCEPTION_B = lookup.findStatic(Upcalls.class, "wrapExceptionB", MethodType.methodType(byte.class, Throwable.class));
            WRAP_EXCEPTION_S = lookup.findStatic(Upcalls.class, "wrapExceptionS", MethodType.methodType(short.class, Throwable.class));
            WRAP_EXCEPTION_I = lookup.findStatic(Upcalls.class, "wrapExceptionI", MethodType.methodType(int.class, Throwable.class));
            WRAP_EXCEPTION_J = lookup.findStatic(Upcalls.class, "wrapExceptionJ", MethodType.methodType(long.class, Throwable.class));
            WRAP_EXCEPTION_F = lookup.findStatic(Upcalls.class, "wrapExceptionF", MethodType.methodType(float.class, Throwable.class));
            WRAP_EXCEPTION_D = lookup.findStatic(Upcalls.class, "wrapExceptionD", MethodType.methodType(double.class, Throwable.class));
            WRAP_EXCEPTION_A = lookup.findStatic(Upcalls.class, "wrapExceptionA", MethodType.methodType(MemorySegment.class, Throwable.class));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static MethodHandle wrapException(FunctionDescriptor descriptor) {
        return descriptor.returnLayout()
            .map(it -> switch (it) {
                case ValueLayout.OfByte _ -> WRAP_EXCEPTION_B;
                case ValueLayout.OfShort _ -> WRAP_EXCEPTION_S;
                case ValueLayout.OfInt _ -> WRAP_EXCEPTION_I;
                case ValueLayout.OfLong _ -> WRAP_EXCEPTION_J;
                case ValueLayout.OfFloat _ -> WRAP_EXCEPTION_F;
                case ValueLayout.OfDouble _ -> WRAP_EXCEPTION_D;
                case AddressLayout _, GroupLayout _ -> WRAP_EXCEPTION_A;
                default -> throw new UnsupportedOperationException("Unsupported callback return type: " + it);
            })
            .orElse(WRAP_EXCEPTION_V);
    }

    @SuppressWarnings("unchecked")
    @Nullable
    private static Consumer<Throwable> getUncaughtExceptionHandlerInstance(Object handler) {
        var className = handler.toString();
        try {
            return (Consumer<Throwable>)Class
                .forName(className)
                .getConstructor()
                .newInstance();
        } catch (Throwable t) {
            if (Checks.DEBUG) {
                t.printStackTrace(DEBUG_STREAM);
            }
            apiLog(String.format("Warning: Failed to instantiate uncaught exception handler: %s. Using the default.", className));
            return null;
        }
    }

    @SuppressWarnings("unchecked")
    private static void wrapException(Throwable t) {
        var handler = Configuration.FFM_UPCALL_EXCEPTION_HANDLER.get();

        if (handler != null && !"default".equals(handler)) {
            if (handler instanceof Consumer<?> consumer) {
                ((Consumer<Throwable>)consumer).accept(t);
                return;
            }

            var consumer = getUncaughtExceptionHandlerInstance(handler);
            if (consumer != null) {
                consumer.accept(t);
                return;
            }
        }

        DEBUG_STREAM.println("[LWJGL] Unhandled exception in callback:");
        t.printStackTrace(DEBUG_STREAM);
    }

    private static void wrapExceptionV(Throwable t) {
        wrapException(t);
    }

    private static byte wrapExceptionB(Throwable t) {
        wrapException(t);
        return (byte)0;
    }

    private static short wrapExceptionS(Throwable t) {
        wrapException(t);
        return (short)0;
    }

    private static int wrapExceptionI(Throwable t) {
        wrapException(t);
        return 0;
    }

    private static long wrapExceptionJ(Throwable t) {
        wrapException(t);
        return 0L;
    }

    private static float wrapExceptionF(Throwable t) {
        wrapException(t);
        return 0.0f;
    }

    private static double wrapExceptionD(Throwable t) {
        wrapException(t);
        return 0.0;
    }

    private static MemorySegment wrapExceptionA(Throwable t) {
        wrapException(t);
        return MemorySegment.NULL;
    }

    /*
    // INTEGER BOOLEAN HELPERS

    private static final MethodHandle Bo2Bt;
    private static final MethodHandle B2S;
    private static final MethodHandle B2I;
    private static final MethodHandle B2L;

    private static final MethodHandle By2Bo;
    private static final MethodHandle S2B;
    private static final MethodHandle I2B;
    private static final MethodHandle L2B;

    static {
        var lookup = MethodHandles.lookup();

        try {
            Bo2Bt = lookup.findStatic(CallbackImpl.class, "b2b", MethodType.methodType(byte.class, boolean.class));
            B2S = lookup.findStatic(CallbackImpl.class, "b2s", MethodType.methodType(short.class, boolean.class));
            B2I = lookup.findStatic(CallbackImpl.class, "b2i", MethodType.methodType(int.class, boolean.class));
            B2L = lookup.findStatic(CallbackImpl.class, "b2l", MethodType.methodType(long.class, boolean.class));

            By2Bo = lookup.findStatic(CallbackImpl.class, "b2b", MethodType.methodType(boolean.class, byte.class));
            S2B = lookup.findStatic(CallbackImpl.class, "s2b", MethodType.methodType(boolean.class, short.class));
            I2B = lookup.findStatic(CallbackImpl.class, "i2b", MethodType.methodType(boolean.class, int.class));
            L2B = lookup.findStatic(CallbackImpl.class, "l2b", MethodType.methodType(boolean.class, long.class));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static byte b2b(boolean value)  { return value ? (byte)1 : (byte)0; }
    private static short b2s(boolean value) { return value ? (short)1 : (short)0; }
    private static int b2i(boolean value)   { return value ? 1 : 0; }
    private static long b2l(boolean value)  { return value ? 1L : 0L; }

    private static boolean b2b(byte value)  { return value != 0; }
    private static boolean s2b(short value) { return value != 0; }
    private static boolean i2b(int value)   { return value != 0; }
    private static boolean l2b(long value)  { return value != 0L; }*/

}
