/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.demo.vulkan.khronos;

import org.joml.*;
import org.lwjgl.*;
import org.lwjgl.sdl.*;
import org.lwjgl.system.*;

import java.nio.*;

import static org.lwjgl.sdl.SDLError.*;
import static org.lwjgl.sdl.SDLEvents.*;
import static org.lwjgl.sdl.SDLInit.*;
import static org.lwjgl.sdl.SDLKeycode.*;
import static org.lwjgl.sdl.SDLTimer.*;
import static org.lwjgl.sdl.SDLVideo.*;
import static org.lwjgl.sdl.SDLVulkan.*;

public class SDLWindow implements Window {

    final long handle;

    public SDLWindow(int width, int height, String title) {
        //Initialize sdl for video since we will obviously have a window we want to present to and load vulkan explicitly
        //even though creating the window will load the default its best to be explicit.
        if (!SDL_InitSubSystem(SDL_INIT_VIDEO) | !SDL_Vulkan_LoadLibrary((ByteBuffer)null)) {
            throw new IllegalStateException(SDL_GetError());
        }

        handle = SDL_CreateWindow(title, width, height, SDL_WINDOW_RESIZABLE | SDL_WINDOW_VULKAN);
    }

    @Override
    public PointerBuffer getRequiredExtensions() {
        PointerBuffer sdlRequiredExtensions = SDL_Vulkan_GetInstanceExtensions();
        if (sdlRequiredExtensions == null) {
            throw new RuntimeException("sdlRequiredExtensions returned null");
        }
        return sdlRequiredExtensions;
    }

    @Override
    public long create_surface(Demo.Instance instance) {
        if (instance == null) {
            return MemoryUtil.NULL;
        }
        try (MemoryStack stack = MemoryStack.stackPush()) {
            LongBuffer pl = stack.mallocLong(1);
            if (!SDL_Vulkan_CreateSurface(handle, instance.getHandle(), null, pl)) {
                throw new IllegalStateException(SDL_GetError());
            }
            return pl.get(0);
        }
    }

    @Override
    public Vector2i getExtent() {
        try (MemoryStack stack = MemoryStack.stackPush()) {
            IntBuffer width  = stack.mallocInt(1);
            IntBuffer height = stack.mallocInt(1);
            SDL_GetWindowSize(handle, width, height);
            return new Vector2i(width.get(0), height.get(0));
        }
    }

    @Override
    public void mainLoop(Demo app) {
        try (MemoryStack stack = MemoryStack.stackPush()) {
            SDL_Event event = SDL_Event.calloc(stack);

            mainLoop:
            while (true) {
                while (SDL_PollEvent(event)) {
                    switch (event.type()) {
                        case SDL_EVENT_QUIT:
                            break mainLoop;
                        case SDL_EVENT_KEY_UP:
                            if (event.key().key() == SDLK_ESCAPE) {
                                SDL_PushEvent(SDL_Event.calloc(stack)
                                    .type(SDL_EVENT_QUIT)
                                    .quit(it -> it
                                        .timestamp(SDL_GetTicksNS()))
                                );
                            }
                            break;
                        case SDL_EVENT_WINDOW_RESIZED:
                            app.resize();
                            break;
                    }
                }
                app.update();
            }
        }
    }

    @Override
    public void close() {
        SDL_DestroyWindow(handle);
        SDL_Vulkan_UnloadLibrary();
        SDL_QuitSubSystem(SDL_INIT_VIDEO);
        SDL_Quit();
    }
}