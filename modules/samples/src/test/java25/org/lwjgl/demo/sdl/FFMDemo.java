/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.demo.sdl;

import java.lang.foreign.*;
import java.lang.invoke.*;
import java.util.*;

import static org.lwjgl.demo.sdl.MySDL.SDL_DisplayEvent.*;
import static org.lwjgl.demo.sdl.MySDL.SDL_Event.*;
import static org.lwjgl.system.ffm.FFM.*;

public class FFMDemo {

    static {
        ffmConfig(
            MySDL.class,
            ffmConfigBuilder(MethodHandles.lookup())
                .withSymbolLookup(SymbolLookup.libraryLookup(Objects.requireNonNull(org.lwjgl.sdl.SDL.getLibrary().getPath()), Arena.global()))
                //.withTracing(TRACER/*, method -> method.getParameterCount() != 0 && method.getParameters()[0].getType() == MemorySegment.class*/)
                .build()
        );
    }

    static final MySDL sdl = ffmGenerate(MySDL.class);

    static void main() {
        try (var arena = Arena.ofConfined()) {
            var displayEvent = SDL_DisplayEvent.allocate(arena);
            System.err.println(displayEvent.displayID());

            var event = SDL_Event.allocate(arena);
            System.err.println(event);
            System.err.println(event.display());
        }
    }

}
