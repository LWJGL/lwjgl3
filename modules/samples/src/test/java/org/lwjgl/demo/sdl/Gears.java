/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.demo.sdl;

import org.lwjgl.*;
import org.lwjgl.demo.opengl.*;
import org.lwjgl.opengl.*;
import org.lwjgl.sdl.*;
import org.lwjgl.system.*;

import java.nio.*;

import static org.lwjgl.sdl.SDLError.*;
import static org.lwjgl.sdl.SDLEvents.*;
import static org.lwjgl.sdl.SDLInit.*;
import static org.lwjgl.sdl.SDLKeycode.*;
import static org.lwjgl.sdl.SDLMain.*;
import static org.lwjgl.sdl.SDLMouse.*;
import static org.lwjgl.sdl.SDLProperties.*;
import static org.lwjgl.sdl.SDLStdinc.*;
import static org.lwjgl.sdl.SDLVideo.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

/** The Gears demo implemented using SDL. */
public class Gears {

    private static final boolean USE_SDL_MAIN_CALLBACKS = Boolean.getBoolean("org.lwjgl.demo.sdl.withMainCallbacks");

    private Callback debugProc;

    private long window, glContext;

    private int xpos;
    private int ypos;
    private int width;
    private int height;

    private boolean continueRunning = true;

    private long lastFpsUpdate;
    private int  frames;

    private GLXGears gears;

    public static void main(String[] args) {
        SDL_SetMemoryFunctions(
            MemoryUtil::nmemAllocChecked,
            MemoryUtil::nmemCallocChecked,
            MemoryUtil::nmemReallocChecked,
            MemoryUtil::nmemFree
        );

        Gears gears = new Gears();
        if (USE_SDL_MAIN_CALLBACKS) {
            gears.runAppCallbacks(args);
        } else {
            gears.run();
        }

        try (MemoryStack stack = stackPush()) {
            PointerBuffer funcs = stack.mallocPointer(4);

            nSDL_GetMemoryFunctions(
                memAddress(funcs, 0),
                memAddress(funcs, 1),
                memAddress(funcs, 2),
                memAddress(funcs, 3)
            );

            for (int i = 0; i < 4; i++) {
                Callback.free(funcs.get(i));
            }
        }
    }

    private static void checkSdlError(boolean success) {
        if (!success) {
            throw new IllegalStateException("SDL error encountered: " + SDL_GetError());
        }
    }

    private static long checkSdlError(long resultPointer) {
        if (resultPointer == 0) {
            throw new IllegalStateException("SDL error encountered: " + SDL_GetError());
        }
        return resultPointer;
    }

    private void run() {
        System.out.println("Starting the non-callback version of the demo");
        try {
            init();

            // This will continue rendering while the event loop below is blocked on window resize
            // Not need with USE_SDL_MAIN_CALLBACKS, SDL calls SDL_AppIterate_func & SDL_AppEvent_func during resizes
            SDL_SetEventFilter((userdata, event) -> {
                SDL_Event e = SDL_Event.create(event);
                switch (e.type()) {
                    case SDL_EVENT_WINDOW_PIXEL_SIZE_CHANGED:
                    case SDL_EVENT_WINDOW_METAL_VIEW_RESIZED:
                        SDL_WindowEvent we = e.window();
                        framebufferSizeChanged(window, we.data1(), we.data2());
                        return false;
                    case SDL_EVENT_WINDOW_EXPOSED:
                        renderFrame();
                        return false;
                }
                return true;
            }, NULL);

            try (MemoryStack stack = stackPush()) {
                SDL_Event event = SDL_Event.calloc(stack);
                while (continueRunning) {
                    while (SDL_PollEvent(event)) {
                        handleEvent(event);
                    }

                    renderFrame();
                }
            }
        } finally {
            destroy();
            SDL_Quit();
        }
    }

    private void runAppCallbacks(String[] args) {
        System.out.println("Starting the callback version of the demo");
        try (SDL_main_func mainFunc = SDL_main_func.create(this::main)) {
            int result = SDL_RunApp(null, mainFunc, NULL);
            if (result != 0) {
                System.err.println("main() finished with error code " + result);
                System.exit(result);
            }
        }
    }

    private int main(int argc, long argv) {
        try (
            SDL_AppInit_func appInit = SDL_AppInit_func.create((_state, _argc, _argv) -> {
                try {
                    init();
                    return SDL_APP_CONTINUE;
                } catch (Throwable t) {
                    t.printStackTrace(System.err);
                    return SDL_APP_FAILURE;
                }
            });

            SDL_AppIterate_func appIterate = SDL_AppIterate_func.create((_state) -> {
                try {
                    renderFrame();
                    return continueRunning ? SDL_APP_CONTINUE : SDL_APP_SUCCESS;
                } catch (Throwable t) {
                    t.printStackTrace(System.err);
                    return SDL_APP_FAILURE;
                }
            });

            SDL_AppEvent_func appEvent = SDL_AppEvent_func.create((_state, eventPtr) -> {
                try {
                    handleEvent(SDL_Event.create(eventPtr));
                    return continueRunning ? SDL_APP_CONTINUE : SDL_APP_SUCCESS;
                } catch (Throwable t) {
                    t.printStackTrace(System.err);
                    return SDL_APP_FAILURE;
                }
            });

            SDL_AppQuit_func appQuit = SDL_AppQuit_func.create((_state, _result) -> {
                try {
                    destroy();
                } catch (Throwable t) {
                    t.printStackTrace(System.err);
                }
            })
        ) {
            return SDL_EnterAppMainCallbacks(
                memPointerBuffer(argv, argc),
                appInit,
                appIterate,
                appEvent,
                appQuit
            );
        }
    }

    private void framebufferSizeChanged(long window, int width, int height) {
        if (width == 0 || height == 0) {
            return;
        }

        gears.setSize(width, height);
    }

    private void init() {
        checkSdlError(SDL_SetAppMetadata("LWJGL SDL Gears demo", Version.getVersion(), "org.lwjgl.demo.sdl.Gears"));
        checkSdlError(SDL_SetAppMetadataProperty(SDL_PROP_APP_METADATA_URL_STRING, "https://www.lwjgl.org/"));
        checkSdlError(SDL_SetAppMetadataProperty(SDL_PROP_APP_METADATA_CREATOR_STRING, "LWJGL"));
        checkSdlError(SDL_SetAppMetadataProperty(SDL_PROP_APP_METADATA_COPYRIGHT_STRING, "License terms: https://www.lwjgl.org/license"));
        checkSdlError(SDL_SetAppMetadataProperty(SDL_PROP_APP_METADATA_TYPE_STRING, "game"));

        if (!SDL_Init(SDL_INIT_VIDEO)) {
            throw new IllegalStateException("Unable to initialize SDL: " + SDL_GetError());
        }

        int WIDTH  = 300;
        int HEIGHT = 300;

        int props = SDL_CreateProperties();
        checkSdlError(SDL_SetNumberProperty(props, SDL_PROP_WINDOW_CREATE_X_NUMBER, SDL_WINDOWPOS_CENTERED));
        checkSdlError(SDL_SetNumberProperty(props, SDL_PROP_WINDOW_CREATE_Y_NUMBER, SDL_WINDOWPOS_CENTERED));
        checkSdlError(SDL_SetNumberProperty(props, SDL_PROP_WINDOW_CREATE_WIDTH_NUMBER, WIDTH));
        checkSdlError(SDL_SetNumberProperty(props, SDL_PROP_WINDOW_CREATE_HEIGHT_NUMBER, HEIGHT));
        checkSdlError(SDL_SetStringProperty(props, SDL_PROP_WINDOW_CREATE_TITLE_STRING, "SDL Gears Demo"));
        checkSdlError(SDL_SetBooleanProperty(props, SDL_PROP_WINDOW_CREATE_OPENGL_BOOLEAN, true));
        checkSdlError(SDL_SetBooleanProperty(props, SDL_PROP_WINDOW_CREATE_HIDDEN_BOOLEAN, true));
        checkSdlError(SDL_SetBooleanProperty(props, SDL_PROP_WINDOW_CREATE_RESIZABLE_BOOLEAN, true));

        checkSdlError(SDL_GL_SetAttribute(SDL_GL_CONTEXT_FLAGS, SDL_GL_CONTEXT_DEBUG_FLAG));
        checkSdlError(SDL_GL_SetAttribute(SDL_GL_CONTEXT_MAJOR_VERSION, 2));
        checkSdlError(SDL_GL_SetAttribute(SDL_GL_CONTEXT_MINOR_VERSION, 1));
        checkSdlError(SDL_GL_SetAttribute(SDL_GL_DOUBLEBUFFER, 1));
        checkSdlError(SDL_GL_SetAttribute(SDL_GL_DEPTH_SIZE, 24));
        checkSdlError(SDL_GL_SetAttribute(SDL_GL_STENCIL_SIZE, 8));

        window = checkSdlError(SDL_CreateWindowWithProperties(props));
        SDL_DestroyProperties(props);

        SDL_SetWindowMinimumSize(window, WIDTH, HEIGHT);
        //SDL_SetWindowAspectRatio(window, 1.0f, 1.0f);

        glContext = checkSdlError(SDL_GL_CreateContext(window));

        checkSdlError(SDL_GL_LoadLibrary((ByteBuffer)null));

        // We want to use SDL's GL proc function to match the SDL-created context.
        Configuration.OPENGL_EXPLICIT_INIT.set(true);
        GL.create(SDLVideo::SDL_GL_GetProcAddress);

        GL.createCapabilities(MemoryUtil::memCallocPointer);
        debugProc = GLUtil.setupDebugMessageCallback();

        gears = new GLXGears();

        checkSdlError(SDL_GL_SetSwapInterval(1));
        checkSdlError(SDL_ShowWindow(window));

        try (MemoryStack ms = stackPush()) {
            IntBuffer x = ms.mallocInt(1);
            IntBuffer y = ms.mallocInt(1);
            checkSdlError(SDL_GetWindowSizeInPixels(window, x, y));
            this.framebufferSizeChanged(window, x.get(0), y.get(0));
        }

        lastFpsUpdate = System.currentTimeMillis();
    }

    private void renderFrame() {
        gears.render();
        gears.animate();

        checkSdlError(SDL_GL_SwapWindow(window));

        frames++;

        long time = System.currentTimeMillis();

        int UPDATE_EVERY = 5; // seconds
        if (UPDATE_EVERY * 1000L <= time - lastFpsUpdate) {
            lastFpsUpdate = time;

            System.out.printf("%d frames in %d seconds = %.2f fps\n", frames, UPDATE_EVERY, (frames / (float)UPDATE_EVERY));
            frames = 0;
        }
    }

    private void handleEvent(SDL_Event event) {
        switch (event.type()) {
            case SDL_EVENT_QUIT:
                continueRunning = false;
                break;
            case SDL_EVENT_WINDOW_PIXEL_SIZE_CHANGED:
            case SDL_EVENT_WINDOW_METAL_VIEW_RESIZED:
                // USE_SDL_MAIN_CALLBACKS only
                SDL_WindowEvent we = event.window();
                framebufferSizeChanged(window, we.data1(), we.data2());
                break;
            case SDL_EVENT_KEY_DOWN:
                SDL_KeyboardEvent keyEvent = event.key();
                switch (keyEvent.key()) {
                    case SDLK_ESCAPE:
                        continueRunning = false;
                        break;
                    case SDLK_A:
                        SDL_FlashWindow(window, SDL_FLASH_BRIEFLY);
                        break;
                    case SDLK_F:
                        try (MemoryStack s = stackPush()) {
                            IntBuffer a = s.ints(0);
                            IntBuffer b = s.ints(0);

                            SDL_GetWindowPosition(window, a, b);
                            xpos = a.get(0);
                            ypos = b.get(0);

                            SDL_GetWindowSize(window, a, b);
                            width = a.get(0);
                            height = b.get(0);
                        }
                        SDL_SetWindowFullscreen(window, true);
                        break;
                    case SDLK_G:
                        SDL_SetWindowRelativeMouseMode(window, !SDL_GetWindowRelativeMouseMode(window));
                        break;
                    case SDLK_O:
                        float prevOpacity = SDL_GetWindowOpacity(window);
                        SDL_SetWindowOpacity(window, prevOpacity > 0.75f ? 0.5f : 1.0f);
                        break;
                    case SDLK_R:
                        SDL_SetWindowResizable(window, (SDL_GetWindowFlags(window) & SDL_WINDOW_RESIZABLE) == 0);
                        break;
                    case SDLK_U:
                        SDL_SetWindowBordered(window, (SDL_GetWindowFlags(window) & SDL_WINDOW_BORDERLESS) != 0);
                        break;
                    case SDLK_W:
                        SDL_SetWindowFullscreen(window, false);
                        SDL_SetWindowPosition(window, xpos, ypos);
                        SDL_SetWindowSize(window, width, height);
                        break;
                }
                break;
            default:
                break;
        }
    }

    private void destroy() {
        memFree(GL.getCapabilities().getAddressBuffer());
        GL.setCapabilities(null);
        GL.destroy();
        if (glContext != NULL) {
            SDL_GL_DestroyContext(glContext);
            SDL_GL_UnloadLibrary();
            glContext = NULL;
        }

        if (debugProc != null) {
            debugProc.free();
        }

        if (window != NULL) {
            SDL_DestroyWindow(window);
            window = NULL;
        }

        try (MemoryStack stack = stackPush()) {
            PointerBuffer pp = stack.mallocPointer(1);
            if (SDL_GetEventFilter(pp, null)) {
                Callback.free(pp.get(0));
            }
        }

        if (SDL_WasInit(SDL_INIT_VIDEO) != 0) {
            SDL_QuitSubSystem(SDL_INIT_VIDEO);
        }
    }

}
