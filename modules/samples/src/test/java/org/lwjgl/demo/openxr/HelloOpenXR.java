/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.demo.openxr;

import org.lwjgl.*;
import org.lwjgl.openxr.*;
import org.lwjgl.openxr.EXTDebugUtils;
import org.lwjgl.system.*;
import org.lwjgl.vulkan.*;

import java.nio.*;

import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

public class HelloOpenXR {

    public static void main(String[] args) {
        System.out.println(System.getProperty("java.library.path"));
        System.out.println(System.getProperty("org.lwjgl.librarypath"));
        Configuration.VULKAN_EXPLICIT_INIT.set(false);
        SharedLibrary XRlib = Library.loadNative(XR.class, "org.lwjgl.openxr", Configuration.OPENXR_LIBRARY_NAME, "C:\\Program Files (x86)\\Steam\\steamapps\\common\\SteamVR\\bin\\win64\\openxr_loader.dll");
//        SharedLibrary XRlib = Library.loadNative(XR.class, "org.lwjgl.openxr", Configuration.OPENXR_LIBRARY_NAME, "C:\\Program Files\\Oculus\\Support\\oculus-runtime\\LibOVRRT64_1.dll");
//        SharedLibrary VKlib = Library.loadNative(VK.class, "org.lwjgl.vulkan", Configuration.VULKAN_LIBRARY_NAME, "vudddlkan-1");
        System.out.println("OpenXR loaded");
        XR.create(XRlib);
        System.out.println("OMG OMG OMGOEOMGOAMDSGO");

        try (MemoryStack stack = stackPush()) {
            //Get all of the availible extensions
            IntBuffer numProps = stack.ints(0);
            XR10.xrEnumerateInstanceExtensionProperties((ByteBuffer)null, numProps, null);

            XrExtensionProperties.Buffer properties = new XrExtensionProperties.Buffer(
                createAndFillVec(stack, numProps.get(), XrExtensionProperties.SIZEOF, XR10.XR_TYPE_EXTENSION_PROPERTIES)
            );
            numProps.rewind();
            XR10.xrEnumerateInstanceExtensionProperties((ByteBuffer)null, numProps, properties);

            System.out.printf("OpenXR loaded with %d extensions:%n", numProps.get());
            while (properties.hasRemaining()) {
                XrExtensionProperties prop = properties.get();
                System.out.println(prop.extensionNameString());
            }

            XrApplicationInfo applicationInfo = new XrApplicationInfo(stack.malloc(XrApplicationInfo.SIZEOF));
            applicationInfo.apiVersion(281474976710670L); //TODO replace this with XR_CURRENT_API_VERSION, this will require further tinkering with vulkangen
            applicationInfo.applicationName(stack.UTF8("TEST NAME"));

            PointerBuffer extension_names = memAllocPointer(64);
            extension_names.put(memASCII(EXTDebugUtils.XR_EXT_DEBUG_UTILS_EXTENSION_NAME));
            extension_names.put(memASCII(KHROpenglEnable.XR_KHR_OPENGL_ENABLE_EXTENSION_NAME));
            extension_names.flip();

            XrInstanceCreateInfo createInfo = new XrInstanceCreateInfo(stack.malloc(XrInstanceCreateInfo.SIZEOF));
            createInfo.set(
                XR10.XR_TYPE_INSTANCE_CREATE_INFO,
                0,
                0,
                applicationInfo,
                null,
                extension_names
            );
            PointerBuffer pp = stack.mallocPointer(1);
            XR10.xrCreateInstance(createInfo, pp);
            XrInstance instance = new XrInstance(pp.get(0), createInfo);

            XrSystemGetInfo systemInfo = new XrSystemGetInfo(stack.malloc(XrSystemGetInfo.SIZEOF));
            systemInfo.set(XR10.XR_TYPE_SYSTEM_GET_INFO,
                0,
                XR10.XR_FORM_FACTOR_HEAD_MOUNTED_DISPLAY);

            LongBuffer systemID = stack.longs(0);
            XR10.xrGetSystem(instance, systemInfo, systemID);
            System.out.println(systemID.get());
        }
    }

    private static ByteBuffer createAndFillVec(MemoryStack stack, int capacity, int sizeof, int fillValue) {
        ByteBuffer b = stack.malloc(capacity * sizeof);

        for (int i = 0; i < capacity; i++) {
            b.position(i * sizeof);
            b.putInt(fillValue);
        }
        b.rewind();
        return b;
    }
}
