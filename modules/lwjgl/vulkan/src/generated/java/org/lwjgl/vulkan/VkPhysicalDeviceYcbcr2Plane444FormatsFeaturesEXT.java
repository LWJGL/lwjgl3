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
 * Structure describing whether the implementation supports additional 2-plane 444 Y′C<sub>B</sub>C<sub>R</sub> formats.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT} structure is included in the {@code pNext} chain of the {@link VkPhysicalDeviceFeatures2} structure passed to {@link VK11#vkGetPhysicalDeviceFeatures2 GetPhysicalDeviceFeatures2}, it is filled in to indicate whether each corresponding feature is supported. {@link VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT} <b>can</b> also be used in the {@code pNext} chain of {@link VkDeviceCreateInfo} to selectively enable these features.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTYcbcr2plane444Formats#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_YCBCR_2_PLANE_444_FORMATS_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_YCBCR_2_PLANE_444_FORMATS_FEATURES_EXT}</li>
 * </ul>
 * 
 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
 * 
 * <p>Although the formats defined by the {@link EXTYcbcr2plane444Formats VK_EXT_ycbcr_2plane_444_formats} were promoted to Vulkan 1.3 as optional formats, the {@link VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT} structure was not promoted to Vulkan 1.3.</p>
 * </div>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkBool32 {@link #ycbcr2plane444Formats};
 * }</code></pre>
 */
public class VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        YCBCR2PLANE444FORMATS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        YCBCR2PLANE444FORMATS = layout.offsetof(2);
    }

    /**
     * Creates a {@code VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT(ByteBuffer container) {
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
     * indicates that the implementation supports the following 2-plane 444 Y′C<sub>B</sub>C<sub>R</sub> formats:
     * 
     * <ul>
     * <li>{@link VK13#VK_FORMAT_G8_B8R8_2PLANE_444_UNORM FORMAT_G8_B8R8_2PLANE_444_UNORM}</li>
     * <li>{@link VK13#VK_FORMAT_G10X6_B10X6R10X6_2PLANE_444_UNORM_3PACK16 FORMAT_G10X6_B10X6R10X6_2PLANE_444_UNORM_3PACK16}</li>
     * <li>{@link VK13#VK_FORMAT_G12X4_B12X4R12X4_2PLANE_444_UNORM_3PACK16 FORMAT_G12X4_B12X4R12X4_2PLANE_444_UNORM_3PACK16}</li>
     * <li>{@link VK13#VK_FORMAT_G16_B16R16_2PLANE_444_UNORM FORMAT_G16_B16R16_2PLANE_444_UNORM}</li>
     * </ul>
     */
    @NativeType("VkBool32")
    public boolean ycbcr2plane444Formats() { return nycbcr2plane444Formats(address()) != 0; }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTYcbcr2plane444Formats#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_YCBCR_2_PLANE_444_FORMATS_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_YCBCR_2_PLANE_444_FORMATS_FEATURES_EXT} value to the {@link #sType} field. */
    public VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT sType$Default() { return sType(EXTYcbcr2plane444Formats.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_YCBCR_2_PLANE_444_FORMATS_FEATURES_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #ycbcr2plane444Formats} field. */
    public VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT ycbcr2plane444Formats(@NativeType("VkBool32") boolean value) { nycbcr2plane444Formats(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT set(
        int sType,
        long pNext,
        boolean ycbcr2plane444Formats
    ) {
        sType(sType);
        pNext(pNext);
        ycbcr2plane444Formats(ycbcr2plane444Formats);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT set(VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT malloc() {
        return wrap(VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT calloc() {
        return wrap(VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT} instance for the specified memory address. */
    public static VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT create(long address) {
        return wrap(VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT createSafe(long address) {
        return address == NULL ? null : wrap(VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT.class, address);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT malloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT calloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT.PNEXT); }
    /** Unsafe version of {@link #ycbcr2plane444Formats}. */
    public static int nycbcr2plane444Formats(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT.YCBCR2PLANE444FORMATS); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT.PNEXT, value); }
    /** Unsafe version of {@link #ycbcr2plane444Formats(boolean) ycbcr2plane444Formats}. */
    public static void nycbcr2plane444Formats(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT.YCBCR2PLANE444FORMATS, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT ELEMENT_FACTORY = VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT#SIZEOF}, and its mark will be undefined.
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
        protected VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT.nsType(address()); }
        /** @return the value of the {@link VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT#ycbcr2plane444Formats} field. */
        @NativeType("VkBool32")
        public boolean ycbcr2plane444Formats() { return VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT.nycbcr2plane444Formats(address()) != 0; }

        /** Sets the specified value to the {@link VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT#sType} field. */
        public VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTYcbcr2plane444Formats#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_YCBCR_2_PLANE_444_FORMATS_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_YCBCR_2_PLANE_444_FORMATS_FEATURES_EXT} value to the {@link VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT#sType} field. */
        public VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT.Buffer sType$Default() { return sType(EXTYcbcr2plane444Formats.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_YCBCR_2_PLANE_444_FORMATS_FEATURES_EXT); }
        /** Sets the specified value to the {@link VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT#pNext} field. */
        public VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT#ycbcr2plane444Formats} field. */
        public VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT.Buffer ycbcr2plane444Formats(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT.nycbcr2plane444Formats(address(), value ? 1 : 0); return this; }

    }

}