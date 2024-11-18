/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package openal.templates

import org.lwjgl.generator.*
import openal.*

val ALC_EXT_direct_context = "EXTDirectContext".nativeClassALC("EXT_direct_context") {
    documentation =
        """
        Native bindings to the $extensionName extension.

        This extension adds functions to use the AL via an explicitly-passed context, rather than the globally set current context that standard AL functions
        utilize.

        The OpenAL API is purposely designed to resemble OpenGL. Among the design decisions was to utilize a "current context" that AL functions implicitly
        access. While this makes sense when making something similar to OpenGL, it presents some problems. For one, OpenGL benefited from the current context
        being thread-local, and disallowed the same context being current on multiple threads at once, along with being more strict about not allowing a
        context to be deleted when it's current. This allowed for efficient lookup as most systems will hold a pointer to thread-local storage in a CPU
        register, where the current GL context can be retrieved by offsetting the register value, while also being assured a given GL call won't have its
        context messed with by another thread during execution. The current context of one thread can't be changed or accessed by another thread.

        In contrast, OpenAL defined its current context as global state. This means whenever an AL function needs to access and use the current context, there
        needs to be protection from other threads having adverse effects on the current context (in regard to both changing which context is current, and
        making state changes that would affect what the initial call was trying to do). This largely negates the benefits an implicit context model provides.

        Additionally, having AL functions act on an implied current context inherits other problems that OpenGL has when driving multiple outputs. As a thread
        can only have one context current at a time, it requires swapping the current context when managing different targets, adding potentially significant
        overhead. For OpenAL, this issue is even worse since the context is global, requiring multi-threaded synchronization if two or more separate threads
        are trying to use different contexts, which may not be possible with more modular components that are unaware of each other using OpenAL.

        Given these issues, many apps can benefit from contexts being explicitly passed to AL functions. Since OpenAL already needs to work safely in
        multi-threaded scenarios, there's little benefit to having to set a context as current for future AL calls to implicitly use, compared to simply
        passing in which context to use when calling AL functions. The purpose of this extension is to provide such functions.
        """

    "ALCvoid".opaque.p(
        "GetProcAddress2",
        "#GetProcAddress() with a different name, for bootstrapping with router DLLs that wrap the {@code ALCcontext} handle.",

        nullable..ALCdevice.p("device", ""),
        ALcharASCII.const.p("funcName", "")
    )

}