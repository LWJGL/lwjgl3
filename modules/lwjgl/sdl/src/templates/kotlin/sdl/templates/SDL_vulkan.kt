/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package sdl.templates

import org.lwjgl.generator.*
import sdl.*
import vulkan.*

val SDL_vulkan = "SDL_vulkan".nativeClassSDL {
    javaImport("org.lwjgl.vulkan.*")

    _Bool(
        "Vulkan_LoadLibrary",

        nullable..charUTF8.const.p("path")
    )

    SDL_FunctionPointer(
        "Vulkan_GetVkGetInstanceProcAddr",

        void()
    )

    void(
        "Vulkan_UnloadLibrary",

        void()
    )

    charASCII.const.p.const.p(
        "Vulkan_GetInstanceExtensions",

        AutoSizeResult..Uint32.p("count")
    )

    _Bool(
        "Vulkan_CreateSurface",

        SDL_Window.p("window"),
        VkInstance("instance"),
        nullable..Check(1)..VkAllocationCallbacks.const.p("allocator"),
        Check(1)..VkSurfaceKHR.p("surface")
    )

    void(
        "Vulkan_DestroySurface",

        VkInstance("instance"),
        VkSurfaceKHR("surface"),
        nullable..Check(1)..VkAllocationCallbacks.const.p("allocator")
    )

    _Bool(
        "Vulkan_GetPresentationSupport",

        VkInstance("instance"),
        VkPhysicalDevice("physicalDevice"),
        Uint32("queueFamilyIndex")
    )

}
