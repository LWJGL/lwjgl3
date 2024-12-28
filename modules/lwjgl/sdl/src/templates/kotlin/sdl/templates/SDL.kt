/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package sdl.templates

import org.lwjgl.generator.*
import sdl.*

// SDL3/SDL.h only includes other headers
val SDL = "SDL".nativeClass(Module.SDL, "SDL", prefix = "SDL", prefixMethod = "SDL_", binding = SDL_BINDING)