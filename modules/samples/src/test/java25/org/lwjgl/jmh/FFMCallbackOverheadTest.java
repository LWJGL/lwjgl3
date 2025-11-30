/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.jmh;

import org.lwjgl.sdl.*;
import org.lwjgl.system.*;
import org.openjdk.jmh.annotations.*;

import java.lang.foreign.*;

import static org.lwjgl.sdl.SDLInit.*;
import static org.lwjgl.system.MemoryUtil.*;

@State(Scope.Benchmark)
public class FFMCallbackOverheadTest {

    static {
        Configuration.FFM_UPCALL_ARENA.set("auto"); // for t2
    }

    private static final SDL_MainThreadCallback upcall = new SDL_MainThreadCallback() {
        @Override
        public void invoke(long userdata) {
            // intentionally empty
        }
    };

    private static final long noop = SymbolLookup
        .libraryLookup("lwjgl", Arena.global())
        .find("noop_params1")
        .orElseThrow()
        .address();

    @Setup
    public void setup() {
        if (!SDL_Init(0)) {
            throw new IllegalStateException();
        }
    }

    @TearDown
    public void tearDown() {
        SDL_Quit();
    }

    /*
    SDL_RunOnMainThread is a nice baseline that doesn't do much, effectively this:

    if (SDL_IsMainThread()) {
        callback(userdata);
        return true;
    }
     */

    @Benchmark
    public void t0_baseline() {
        // call a empty native function that does not go back to Java
        // this is the baseline overhead without the upcall cost
        nSDL_RunOnMainThread(noop, NULL, true);
    }

    @Benchmark
    public void t1_java() {
        // call an empty JNI/FFM upcall
        // java - baseline = Java upcall overhead
        SDL_RunOnMainThread(upcall, NULL, true);
    }

    //@Benchmark
    public void t2_setup() {
        // this measures the upcall setup/cleanup overhead for JNI/FFM
        try (var callback = new SDL_MainThreadCallback() {
            @Override
            public void invoke(long userdata) {
                // intentionally empty
            }
        }) {
            SDL_RunOnMainThread(callback, NULL, true);
        }
    }

    //@Benchmark
    public void t3_setup_scoped() {
        try (var arena = Arena.ofConfined()) {
            var callback = memScopedCall(arena, () -> new SDL_MainThreadCallback() {
                @Override
                public void invoke(long userdata) {
                    // intentionally empty
                }
            });
            SDL_RunOnMainThread(callback, NULL, true);
            callback.free();
        }
    }

}