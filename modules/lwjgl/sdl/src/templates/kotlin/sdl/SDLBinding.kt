/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package sdl

import org.lwjgl.generator.*

val SDL_BINDING = simpleBinding(
    Module.SDL,
    libraryExpression = """Configuration.SDL_LIBRARY_NAME.get(Platform.mapLibraryNameBundled("SDL3"))""",
    bundledWithLWJGL = true
)
val SDL_BINDING_DELEGATE = SDL_BINDING.delegate("SDL.getLibrary()")

// DSL Extensions

fun String.nativeClassSDL(templateName: String, init: (NativeClass.() -> Unit)? = null) =
    nativeClass(Module.SDL, templateName, prefix = "SDL", prefixMethod = "SDL_", binding = SDL_BINDING_DELEGATE, init = init)

val SDLFreeResult = Code(javaFinally = statement("$t$t${t}nSDL_free(__result);", ApplyTo.ALTERNATIVE))
