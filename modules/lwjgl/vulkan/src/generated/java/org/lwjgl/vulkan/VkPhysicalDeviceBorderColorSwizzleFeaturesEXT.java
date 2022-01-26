/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Structure describing whether samplers with custom border colors require the component swizzle specified in order to have defined behavior.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkPhysicalDeviceBorderColorSwizzleFeaturesEXT} structure is included in the {@code pNext} chain of the {@link VkPhysicalDeviceFeatures2} structure passed to {@link VK11#vkGetPhysicalDeviceFeatures2 GetPhysicalDeviceFeatures2}, it is filled in to indicate whether each corresponding feature is supported. {@link VkPhysicalDeviceBorderColorSwizzleFeaturesEXT} <b>can</b> also be used in the {@code pNext} chain of {@link VkDeviceCreateInfo} to selectively enable these features.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTBorderColorSwizzle#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_BORDER_COLOR_SWIZZLE_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_BORDER_COLOR_SWIZZLE_FEATURES_EXT}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceBorderColorSwizzleFeaturesEXT {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkBool32 {@link #borderColorSwizzle};
 *     VkBool32 {@link #borderColorSwizzleFromImage};
 * }</code></pre>
 */
public class VkPhysicalDeviceBorderColorSwizzleFeaturesEXT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        BORDERCOLORSWIZZLE,
        BORDERCOLORSWIZZLEFROMIMAGE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        BORDERCOLORSWIZZLE = layout.offsetof(2);
        BORDERCOLORSWIZZLEFROMIMAGE = layout.offsetof(3);
    }

    /**
     * Creates a {@code VkPhysicalDeviceBorderColorSwizzleFeaturesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceBorderColorSwizzleFeaturesEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the type of this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** indicates that defined values are returned by sampled image operations when used with a sampler that uses a {@link VK10#VK_BORDER_COLOR_FLOAT_OPAQUE_BLACK BORDER_COLOR_FLOAT_OPAQUE_BLACK}, {@link VK10#VK_BORDER_COLOR_INT_OPAQUE_BLACK BORDER_COLOR_INT_OPAQUE_BLACK}, {@link EXTCustomBorderColor#VK_BORDER_COLOR_FLOAT_CUSTOM_EXT BORDER_COLOR_FLOAT_CUSTOM_EXT}, or {@link EXTCustomBorderColor#VK_BORDER_COLOR_INT_CUSTOM_EXT BORDER_COLOR_INT_CUSTOM_EXT} {@code borderColor} and an image view that uses a non-<a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#resources-image-views-identity-mappings">identity component mapping</a>, when either {@code borderColorSwizzleFromImage} is enabled or the {@link VkSamplerBorderColorComponentMappingCreateInfoEXT} is specified. */
    @NativeType("VkBool32")
    public boolean borderColorSwizzle() { return nborderColorSwizzle(address()) != 0; }
    /** indicates that the implementation will return the correct border color values from sampled image operations under the conditions expressed above, without the application having to specify the border color component mapping when creating the sampler object. If this feature bit is not set, applications <b>can</b> chain a {@link VkSamplerBorderColorComponentMappingCreateInfoEXT} structure when creating samplers for use with image views that do not have an <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#resources-image-views-identity-mappings">identity swizzle</a> and, when those samplers are combined with image views using the same component mapping, sampled image operations that use opaque black or custom border colors will return the correct border color values. */
    @NativeType("VkBool32")
    public boolean borderColorSwizzleFromImage() { return nborderColorSwizzleFromImage(address()) != 0; }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPhysicalDeviceBorderColorSwizzleFeaturesEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTBorderColorSwizzle#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_BORDER_COLOR_SWIZZLE_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_BORDER_COLOR_SWIZZLE_FEATURES_EXT} value to the {@link #sType} field. */
    public VkPhysicalDeviceBorderColorSwizzleFeaturesEXT sType$Default() { return sType(EXTBorderColorSwizzle.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_BORDER_COLOR_SWIZZLE_FEATURES_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPhysicalDeviceBorderColorSwizzleFeaturesEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #borderColorSwizzle} field. */
    public VkPhysicalDeviceBorderColorSwizzleFeaturesEXT borderColorSwizzle(@NativeType("VkBool32") boolean value) { nborderColorSwizzle(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #borderColorSwizzleFromImage} field. */
    public VkPhysicalDeviceBorderColorSwizzleFeaturesEXT borderColorSwizzleFromImage(@NativeType("VkBool32") boolean value) { nborderColorSwizzleFromImage(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceBorderColorSwizzleFeaturesEXT set(
        int sType,
        long pNext,
        boolean borderColorSwizzle,
        boolean borderColorSwizzleFromImage
    ) {
        sType(sType);
        pNext(pNext);
        borderColorSwizzle(borderColorSwizzle);
        borderColorSwizzleFromImage(borderColorSwizzleFromImage);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceBorderColorSwizzleFeaturesEXT set(VkPhysicalDeviceBorderColorSwizzleFeaturesEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceBorderColorSwizzleFeaturesEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceBorderColorSwizzleFeaturesEXT malloc() {
        return wrap(VkPhysicalDeviceBorderColorSwizzleFeaturesEXT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceBorderColorSwizzleFeaturesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceBorderColorSwizzleFeaturesEXT calloc() {
        return wrap(VkPhysicalDeviceBorderColorSwizzleFeaturesEXT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceBorderColorSwizzleFeaturesEXT} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceBorderColorSwizzleFeaturesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPhysicalDeviceBorderColorSwizzleFeaturesEXT.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceBorderColorSwizzleFeaturesEXT} instance for the specified memory address. */
    public static VkPhysicalDeviceBorderColorSwizzleFeaturesEXT create(long address) {
        return wrap(VkPhysicalDeviceBorderColorSwizzleFeaturesEXT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceBorderColorSwizzleFeaturesEXT createSafe(long address) {
        return address == NULL ? null : wrap(VkPhysicalDeviceBorderColorSwizzleFeaturesEXT.class, address);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceBorderColorSwizzleFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceBorderColorSwizzleFeaturesEXT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceBorderColorSwizzleFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceBorderColorSwizzleFeaturesEXT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceBorderColorSwizzleFeaturesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceBorderColorSwizzleFeaturesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPhysicalDeviceBorderColorSwizzleFeaturesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceBorderColorSwizzleFeaturesEXT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceBorderColorSwizzleFeaturesEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceBorderColorSwizzleFeaturesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceBorderColorSwizzleFeaturesEXT malloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceBorderColorSwizzleFeaturesEXT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPhysicalDeviceBorderColorSwizzleFeaturesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceBorderColorSwizzleFeaturesEXT calloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceBorderColorSwizzleFeaturesEXT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceBorderColorSwizzleFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceBorderColorSwizzleFeaturesEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceBorderColorSwizzleFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceBorderColorSwizzleFeaturesEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceBorderColorSwizzleFeaturesEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceBorderColorSwizzleFeaturesEXT.PNEXT); }
    /** Unsafe version of {@link #borderColorSwizzle}. */
    public static int nborderColorSwizzle(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceBorderColorSwizzleFeaturesEXT.BORDERCOLORSWIZZLE); }
    /** Unsafe version of {@link #borderColorSwizzleFromImage}. */
    public static int nborderColorSwizzleFromImage(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceBorderColorSwizzleFeaturesEXT.BORDERCOLORSWIZZLEFROMIMAGE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceBorderColorSwizzleFeaturesEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceBorderColorSwizzleFeaturesEXT.PNEXT, value); }
    /** Unsafe version of {@link #borderColorSwizzle(boolean) borderColorSwizzle}. */
    public static void nborderColorSwizzle(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceBorderColorSwizzleFeaturesEXT.BORDERCOLORSWIZZLE, value); }
    /** Unsafe version of {@link #borderColorSwizzleFromImage(boolean) borderColorSwizzleFromImage}. */
    public static void nborderColorSwizzleFromImage(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceBorderColorSwizzleFeaturesEXT.BORDERCOLORSWIZZLEFROMIMAGE, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceBorderColorSwizzleFeaturesEXT} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceBorderColorSwizzleFeaturesEXT, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceBorderColorSwizzleFeaturesEXT ELEMENT_FACTORY = VkPhysicalDeviceBorderColorSwizzleFeaturesEXT.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceBorderColorSwizzleFeaturesEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceBorderColorSwizzleFeaturesEXT#SIZEOF}, and its mark will be undefined.
         *
         * <p>The created buffer instance holds a strong reference to the container object.</p>
         */
        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SIZEOF);
        }

        public Buffer(long address, int cap) {
            super(address, null, -1, 0, cap, cap);
        }

        Buffer(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        @Override
        protected Buffer self() {
            return this;
        }

        @Override
        protected VkPhysicalDeviceBorderColorSwizzleFeaturesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPhysicalDeviceBorderColorSwizzleFeaturesEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceBorderColorSwizzleFeaturesEXT.nsType(address()); }
        /** @return the value of the {@link VkPhysicalDeviceBorderColorSwizzleFeaturesEXT#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceBorderColorSwizzleFeaturesEXT.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDeviceBorderColorSwizzleFeaturesEXT#borderColorSwizzle} field. */
        @NativeType("VkBool32")
        public boolean borderColorSwizzle() { return VkPhysicalDeviceBorderColorSwizzleFeaturesEXT.nborderColorSwizzle(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceBorderColorSwizzleFeaturesEXT#borderColorSwizzleFromImage} field. */
        @NativeType("VkBool32")
        public boolean borderColorSwizzleFromImage() { return VkPhysicalDeviceBorderColorSwizzleFeaturesEXT.nborderColorSwizzleFromImage(address()) != 0; }

        /** Sets the specified value to the {@link VkPhysicalDeviceBorderColorSwizzleFeaturesEXT#sType} field. */
        public VkPhysicalDeviceBorderColorSwizzleFeaturesEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceBorderColorSwizzleFeaturesEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTBorderColorSwizzle#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_BORDER_COLOR_SWIZZLE_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_BORDER_COLOR_SWIZZLE_FEATURES_EXT} value to the {@link VkPhysicalDeviceBorderColorSwizzleFeaturesEXT#sType} field. */
        public VkPhysicalDeviceBorderColorSwizzleFeaturesEXT.Buffer sType$Default() { return sType(EXTBorderColorSwizzle.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_BORDER_COLOR_SWIZZLE_FEATURES_EXT); }
        /** Sets the specified value to the {@link VkPhysicalDeviceBorderColorSwizzleFeaturesEXT#pNext} field. */
        public VkPhysicalDeviceBorderColorSwizzleFeaturesEXT.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceBorderColorSwizzleFeaturesEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceBorderColorSwizzleFeaturesEXT#borderColorSwizzle} field. */
        public VkPhysicalDeviceBorderColorSwizzleFeaturesEXT.Buffer borderColorSwizzle(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceBorderColorSwizzleFeaturesEXT.nborderColorSwizzle(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceBorderColorSwizzleFeaturesEXT#borderColorSwizzleFromImage} field. */
        public VkPhysicalDeviceBorderColorSwizzleFeaturesEXT.Buffer borderColorSwizzleFromImage(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceBorderColorSwizzleFeaturesEXT.nborderColorSwizzleFromImage(address(), value ? 1 : 0); return this; }

    }

}