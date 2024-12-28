/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.demo.sdl;

import static org.lwjgl.sdl.SDLMessageBox.*;

public class HelloSDL {
    private HelloSDL() {
    }

    public static void main(String[] args) {
        SDL_ShowSimpleMessageBox(SDL_MESSAGEBOX_INFORMATION, "Hello, world", "Hello from LWJGL's SDL bindings!", 0);
    }
}
