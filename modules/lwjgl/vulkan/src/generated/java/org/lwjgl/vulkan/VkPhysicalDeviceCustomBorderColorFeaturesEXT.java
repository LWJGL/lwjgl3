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
 * Structure describing whether custom border colors can be supported by an implementation.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkPhysicalDeviceCustomBorderColorFeaturesEXT} structure is included in the {@code pNext} chain of the {@link VkPhysicalDeviceFeatures2} structure passed to {@link VK11#vkGetPhysicalDeviceFeatures2 GetPhysicalDeviceFeatures2}, it is filled in to indicate whether each corresponding feature is supported. {@link VkPhysicalDeviceCustomBorderColorFeaturesEXT} <b>can</b> also be used in the {@code pNext} chain of {@link VkDeviceCreateInfo} to selectively enable these features.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTCustomBorderColor#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_CUSTOM_BORDER_COLOR_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_CUSTOM_BORDER_COLOR_FEATURES_EXT}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceCustomBorderColorFeaturesEXT {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkBool32 {@link #customBorderColors};
 *     VkBool32 {@link #customBorderColorWithoutFormat};
 * }</code></pre>
 */
public class VkPhysicalDeviceCustomBorderColorFeaturesEXT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        CUSTOMBORDERCOLORS,
        CUSTOMBORDERCOLORWITHOUTFORMAT;

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
        CUSTOMBORDERCOLORS = layout.offsetof(2);
        CUSTOMBORDERCOLORWITHOUTFORMAT = layout.offsetof(3);
    }

    /**
     * Creates a {@code VkPhysicalDeviceCustomBorderColorFeaturesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceCustomBorderColorFeaturesEXT(ByteBuffer container) {
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
    /**
     * indicates that the implementation supports providing a {@code borderColor} value with one of the following values at sampler creation time:
     * 
     * <ul>
     * <li>{@link EXTCustomBorderColor#VK_BORDER_COLOR_FLOAT_CUSTOM_EXT BORDER_COLOR_FLOAT_CUSTOM_EXT}</li>
     * <li>{@link EXTCustomBorderColor#VK_BORDER_COLOR_INT_CUSTOM_EXT BORDER_COLOR_INT_CUSTOM_EXT}</li>
     * </ul>
     */
    @NativeType("VkBool32")
    public boolean customBorderColors() { return ncustomBorderColors(address()) != 0; }
    /** indicates that explicit formats are not required for custom border colors and the value of the {@code format} member of the {@link VkSamplerCustomBorderColorCreateInfoEXT} structure <b>may</b> be {@link VK10#VK_FORMAT_UNDEFINED FORMAT_UNDEFINED}. If this feature bit is not set, applications <b>must</b> provide the {@code VkFormat} of the image view(s) being sampled by this sampler in the {@code format} member of the {@link VkSamplerCustomBorderColorCreateInfoEXT} structure. */
    @NativeType("VkBool32")
    public boolean customBorderColorWithoutFormat() { return ncustomBorderColorWithoutFormat(address()) != 0; }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPhysicalDeviceCustomBorderColorFeaturesEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTCustomBorderColor#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_CUSTOM_BORDER_COLOR_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_CUSTOM_BORDER_COLOR_FEATURES_EXT} value to the {@link #sType} field. */
    public VkPhysicalDeviceCustomBorderColorFeaturesEXT sType$Default() { return sType(EXTCustomBorderColor.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_CUSTOM_BORDER_COLOR_FEATURES_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPhysicalDeviceCustomBorderColorFeaturesEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #customBorderColors} field. */
    public VkPhysicalDeviceCustomBorderColorFeaturesEXT customBorderColors(@NativeType("VkBool32") boolean value) { ncustomBorderColors(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #customBorderColorWithoutFormat} field. */
    public VkPhysicalDeviceCustomBorderColorFeaturesEXT customBorderColorWithoutFormat(@NativeType("VkBool32") boolean value) { ncustomBorderColorWithoutFormat(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceCustomBorderColorFeaturesEXT set(
        int sType,
        long pNext,
        boolean customBorderColors,
        boolean customBorderColorWithoutFormat
    ) {
        sType(sType);
        pNext(pNext);
        customBorderColors(customBorderColors);
        customBorderColorWithoutFormat(customBorderColorWithoutFormat);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceCustomBorderColorFeaturesEXT set(VkPhysicalDeviceCustomBorderColorFeaturesEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceCustomBorderColorFeaturesEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceCustomBorderColorFeaturesEXT malloc() {
        return wrap(VkPhysicalDeviceCustomBorderColorFeaturesEXT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceCustomBorderColorFeaturesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceCustomBorderColorFeaturesEXT calloc() {
        return wrap(VkPhysicalDeviceCustomBorderColorFeaturesEXT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceCustomBorderColorFeaturesEXT} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceCustomBorderColorFeaturesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPhysicalDeviceCustomBorderColorFeaturesEXT.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceCustomBorderColorFeaturesEXT} instance for the specified memory address. */
    public static VkPhysicalDeviceCustomBorderColorFeaturesEXT create(long address) {
        return wrap(VkPhysicalDeviceCustomBorderColorFeaturesEXT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceCustomBorderColorFeaturesEXT createSafe(long address) {
        return address == NULL ? null : wrap(VkPhysicalDeviceCustomBorderColorFeaturesEXT.class, address);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceCustomBorderColorFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceCustomBorderColorFeaturesEXT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceCustomBorderColorFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceCustomBorderColorFeaturesEXT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceCustomBorderColorFeaturesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceCustomBorderColorFeaturesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPhysicalDeviceCustomBorderColorFeaturesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceCustomBorderColorFeaturesEXT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceCustomBorderColorFeaturesEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceCustomBorderColorFeaturesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceCustomBorderColorFeaturesEXT malloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceCustomBorderColorFeaturesEXT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPhysicalDeviceCustomBorderColorFeaturesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceCustomBorderColorFeaturesEXT calloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceCustomBorderColorFeaturesEXT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceCustomBorderColorFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceCustomBorderColorFeaturesEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceCustomBorderColorFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceCustomBorderColorFeaturesEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceCustomBorderColorFeaturesEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceCustomBorderColorFeaturesEXT.PNEXT); }
    /** Unsafe version of {@link #customBorderColors}. */
    public static int ncustomBorderColors(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceCustomBorderColorFeaturesEXT.CUSTOMBORDERCOLORS); }
    /** Unsafe version of {@link #customBorderColorWithoutFormat}. */
    public static int ncustomBorderColorWithoutFormat(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceCustomBorderColorFeaturesEXT.CUSTOMBORDERCOLORWITHOUTFORMAT); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceCustomBorderColorFeaturesEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceCustomBorderColorFeaturesEXT.PNEXT, value); }
    /** Unsafe version of {@link #customBorderColors(boolean) customBorderColors}. */
    public static void ncustomBorderColors(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceCustomBorderColorFeaturesEXT.CUSTOMBORDERCOLORS, value); }
    /** Unsafe version of {@link #customBorderColorWithoutFormat(boolean) customBorderColorWithoutFormat}. */
    public static void ncustomBorderColorWithoutFormat(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceCustomBorderColorFeaturesEXT.CUSTOMBORDERCOLORWITHOUTFORMAT, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceCustomBorderColorFeaturesEXT} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceCustomBorderColorFeaturesEXT, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceCustomBorderColorFeaturesEXT ELEMENT_FACTORY = VkPhysicalDeviceCustomBorderColorFeaturesEXT.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceCustomBorderColorFeaturesEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceCustomBorderColorFeaturesEXT#SIZEOF}, and its mark will be undefined.
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
        protected VkPhysicalDeviceCustomBorderColorFeaturesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPhysicalDeviceCustomBorderColorFeaturesEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceCustomBorderColorFeaturesEXT.nsType(address()); }
        /** @return the value of the {@link VkPhysicalDeviceCustomBorderColorFeaturesEXT#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceCustomBorderColorFeaturesEXT.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDeviceCustomBorderColorFeaturesEXT#customBorderColors} field. */
        @NativeType("VkBool32")
        public boolean customBorderColors() { return VkPhysicalDeviceCustomBorderColorFeaturesEXT.ncustomBorderColors(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceCustomBorderColorFeaturesEXT#customBorderColorWithoutFormat} field. */
        @NativeType("VkBool32")
        public boolean customBorderColorWithoutFormat() { return VkPhysicalDeviceCustomBorderColorFeaturesEXT.ncustomBorderColorWithoutFormat(address()) != 0; }

        /** Sets the specified value to the {@link VkPhysicalDeviceCustomBorderColorFeaturesEXT#sType} field. */
        public VkPhysicalDeviceCustomBorderColorFeaturesEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceCustomBorderColorFeaturesEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTCustomBorderColor#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_CUSTOM_BORDER_COLOR_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_CUSTOM_BORDER_COLOR_FEATURES_EXT} value to the {@link VkPhysicalDeviceCustomBorderColorFeaturesEXT#sType} field. */
        public VkPhysicalDeviceCustomBorderColorFeaturesEXT.Buffer sType$Default() { return sType(EXTCustomBorderColor.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_CUSTOM_BORDER_COLOR_FEATURES_EXT); }
        /** Sets the specified value to the {@link VkPhysicalDeviceCustomBorderColorFeaturesEXT#pNext} field. */
        public VkPhysicalDeviceCustomBorderColorFeaturesEXT.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceCustomBorderColorFeaturesEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceCustomBorderColorFeaturesEXT#customBorderColors} field. */
        public VkPhysicalDeviceCustomBorderColorFeaturesEXT.Buffer customBorderColors(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceCustomBorderColorFeaturesEXT.ncustomBorderColors(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceCustomBorderColorFeaturesEXT#customBorderColorWithoutFormat} field. */
        public VkPhysicalDeviceCustomBorderColorFeaturesEXT.Buffer customBorderColorWithoutFormat(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceCustomBorderColorFeaturesEXT.ncustomBorderColorWithoutFormat(address(), value ? 1 : 0); return this; }

    }

}