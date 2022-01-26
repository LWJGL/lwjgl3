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
 * Structure describing additional 4444 formats supported by an implementation.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkPhysicalDevice4444FormatsFeaturesEXT} structure is included in the {@code pNext} chain of the {@link VkPhysicalDeviceFeatures2} structure passed to {@link VK11#vkGetPhysicalDeviceFeatures2 GetPhysicalDeviceFeatures2}, it is filled in to indicate whether each corresponding feature is supported. {@link VkPhysicalDevice4444FormatsFeaturesEXT} <b>can</b> also be used in the {@code pNext} chain of {@link VkDeviceCreateInfo} to selectively enable these features.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXT4444Formats#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_4444_FORMATS_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_4444_FORMATS_FEATURES_EXT}</li>
 * </ul>
 * 
 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
 * 
 * <p>Although the formats defined by the {@link EXT4444Formats VK_EXT_4444_formats} extension were promoted to Vulkan 1.3 as optional formats, the {@link VkPhysicalDevice4444FormatsFeaturesEXT} structure was not promoted to Vulkan 1.3.</p>
 * </div>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDevice4444FormatsFeaturesEXT {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkBool32 {@link #formatA4R4G4B4};
 *     VkBool32 {@link #formatA4B4G4R4};
 * }</code></pre>
 */
public class VkPhysicalDevice4444FormatsFeaturesEXT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FORMATA4R4G4B4,
        FORMATA4B4G4R4;

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
        FORMATA4R4G4B4 = layout.offsetof(2);
        FORMATA4B4G4R4 = layout.offsetof(3);
    }

    /**
     * Creates a {@code VkPhysicalDevice4444FormatsFeaturesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDevice4444FormatsFeaturesEXT(ByteBuffer container) {
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
     * indicates that the implementation <b>must</b> support using a {@code VkFormat} of {@link EXT4444Formats#VK_FORMAT_A4R4G4B4_UNORM_PACK16_EXT FORMAT_A4R4G4B4_UNORM_PACK16_EXT} with at least the following {@code VkFormatFeatureFlagBits}:
     * 
     * <ul>
     * <li>{@link VK10#VK_FORMAT_FEATURE_SAMPLED_IMAGE_BIT FORMAT_FEATURE_SAMPLED_IMAGE_BIT}</li>
     * <li>{@link VK10#VK_FORMAT_FEATURE_BLIT_SRC_BIT FORMAT_FEATURE_BLIT_SRC_BIT}</li>
     * <li>{@link VK10#VK_FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_LINEAR_BIT FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_LINEAR_BIT}</li>
     * </ul>
     */
    @NativeType("VkBool32")
    public boolean formatA4R4G4B4() { return nformatA4R4G4B4(address()) != 0; }
    /**
     * indicates that the implementation <b>must</b> support using a {@code VkFormat} of {@link EXT4444Formats#VK_FORMAT_A4B4G4R4_UNORM_PACK16_EXT FORMAT_A4B4G4R4_UNORM_PACK16_EXT} with at least the following {@code VkFormatFeatureFlagBits}:
     * 
     * <ul>
     * <li>{@link VK10#VK_FORMAT_FEATURE_SAMPLED_IMAGE_BIT FORMAT_FEATURE_SAMPLED_IMAGE_BIT}</li>
     * <li>{@link VK10#VK_FORMAT_FEATURE_BLIT_SRC_BIT FORMAT_FEATURE_BLIT_SRC_BIT}</li>
     * <li>{@link VK10#VK_FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_LINEAR_BIT FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_LINEAR_BIT}</li>
     * </ul>
     */
    @NativeType("VkBool32")
    public boolean formatA4B4G4R4() { return nformatA4B4G4R4(address()) != 0; }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPhysicalDevice4444FormatsFeaturesEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXT4444Formats#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_4444_FORMATS_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_4444_FORMATS_FEATURES_EXT} value to the {@link #sType} field. */
    public VkPhysicalDevice4444FormatsFeaturesEXT sType$Default() { return sType(EXT4444Formats.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_4444_FORMATS_FEATURES_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPhysicalDevice4444FormatsFeaturesEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #formatA4R4G4B4} field. */
    public VkPhysicalDevice4444FormatsFeaturesEXT formatA4R4G4B4(@NativeType("VkBool32") boolean value) { nformatA4R4G4B4(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #formatA4B4G4R4} field. */
    public VkPhysicalDevice4444FormatsFeaturesEXT formatA4B4G4R4(@NativeType("VkBool32") boolean value) { nformatA4B4G4R4(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDevice4444FormatsFeaturesEXT set(
        int sType,
        long pNext,
        boolean formatA4R4G4B4,
        boolean formatA4B4G4R4
    ) {
        sType(sType);
        pNext(pNext);
        formatA4R4G4B4(formatA4R4G4B4);
        formatA4B4G4R4(formatA4B4G4R4);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDevice4444FormatsFeaturesEXT set(VkPhysicalDevice4444FormatsFeaturesEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDevice4444FormatsFeaturesEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDevice4444FormatsFeaturesEXT malloc() {
        return wrap(VkPhysicalDevice4444FormatsFeaturesEXT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDevice4444FormatsFeaturesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDevice4444FormatsFeaturesEXT calloc() {
        return wrap(VkPhysicalDevice4444FormatsFeaturesEXT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDevice4444FormatsFeaturesEXT} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDevice4444FormatsFeaturesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPhysicalDevice4444FormatsFeaturesEXT.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDevice4444FormatsFeaturesEXT} instance for the specified memory address. */
    public static VkPhysicalDevice4444FormatsFeaturesEXT create(long address) {
        return wrap(VkPhysicalDevice4444FormatsFeaturesEXT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDevice4444FormatsFeaturesEXT createSafe(long address) {
        return address == NULL ? null : wrap(VkPhysicalDevice4444FormatsFeaturesEXT.class, address);
    }

    /**
     * Returns a new {@link VkPhysicalDevice4444FormatsFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevice4444FormatsFeaturesEXT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDevice4444FormatsFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevice4444FormatsFeaturesEXT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDevice4444FormatsFeaturesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevice4444FormatsFeaturesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPhysicalDevice4444FormatsFeaturesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevice4444FormatsFeaturesEXT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDevice4444FormatsFeaturesEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDevice4444FormatsFeaturesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDevice4444FormatsFeaturesEXT malloc(MemoryStack stack) {
        return wrap(VkPhysicalDevice4444FormatsFeaturesEXT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPhysicalDevice4444FormatsFeaturesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDevice4444FormatsFeaturesEXT calloc(MemoryStack stack) {
        return wrap(VkPhysicalDevice4444FormatsFeaturesEXT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDevice4444FormatsFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevice4444FormatsFeaturesEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDevice4444FormatsFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevice4444FormatsFeaturesEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDevice4444FormatsFeaturesEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDevice4444FormatsFeaturesEXT.PNEXT); }
    /** Unsafe version of {@link #formatA4R4G4B4}. */
    public static int nformatA4R4G4B4(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDevice4444FormatsFeaturesEXT.FORMATA4R4G4B4); }
    /** Unsafe version of {@link #formatA4B4G4R4}. */
    public static int nformatA4B4G4R4(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDevice4444FormatsFeaturesEXT.FORMATA4B4G4R4); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDevice4444FormatsFeaturesEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDevice4444FormatsFeaturesEXT.PNEXT, value); }
    /** Unsafe version of {@link #formatA4R4G4B4(boolean) formatA4R4G4B4}. */
    public static void nformatA4R4G4B4(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDevice4444FormatsFeaturesEXT.FORMATA4R4G4B4, value); }
    /** Unsafe version of {@link #formatA4B4G4R4(boolean) formatA4B4G4R4}. */
    public static void nformatA4B4G4R4(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDevice4444FormatsFeaturesEXT.FORMATA4B4G4R4, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDevice4444FormatsFeaturesEXT} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDevice4444FormatsFeaturesEXT, Buffer> implements NativeResource {

        private static final VkPhysicalDevice4444FormatsFeaturesEXT ELEMENT_FACTORY = VkPhysicalDevice4444FormatsFeaturesEXT.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDevice4444FormatsFeaturesEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDevice4444FormatsFeaturesEXT#SIZEOF}, and its mark will be undefined.
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
        protected VkPhysicalDevice4444FormatsFeaturesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPhysicalDevice4444FormatsFeaturesEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDevice4444FormatsFeaturesEXT.nsType(address()); }
        /** @return the value of the {@link VkPhysicalDevice4444FormatsFeaturesEXT#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDevice4444FormatsFeaturesEXT.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDevice4444FormatsFeaturesEXT#formatA4R4G4B4} field. */
        @NativeType("VkBool32")
        public boolean formatA4R4G4B4() { return VkPhysicalDevice4444FormatsFeaturesEXT.nformatA4R4G4B4(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDevice4444FormatsFeaturesEXT#formatA4B4G4R4} field. */
        @NativeType("VkBool32")
        public boolean formatA4B4G4R4() { return VkPhysicalDevice4444FormatsFeaturesEXT.nformatA4B4G4R4(address()) != 0; }

        /** Sets the specified value to the {@link VkPhysicalDevice4444FormatsFeaturesEXT#sType} field. */
        public VkPhysicalDevice4444FormatsFeaturesEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDevice4444FormatsFeaturesEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXT4444Formats#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_4444_FORMATS_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_4444_FORMATS_FEATURES_EXT} value to the {@link VkPhysicalDevice4444FormatsFeaturesEXT#sType} field. */
        public VkPhysicalDevice4444FormatsFeaturesEXT.Buffer sType$Default() { return sType(EXT4444Formats.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_4444_FORMATS_FEATURES_EXT); }
        /** Sets the specified value to the {@link VkPhysicalDevice4444FormatsFeaturesEXT#pNext} field. */
        public VkPhysicalDevice4444FormatsFeaturesEXT.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDevice4444FormatsFeaturesEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkPhysicalDevice4444FormatsFeaturesEXT#formatA4R4G4B4} field. */
        public VkPhysicalDevice4444FormatsFeaturesEXT.Buffer formatA4R4G4B4(@NativeType("VkBool32") boolean value) { VkPhysicalDevice4444FormatsFeaturesEXT.nformatA4R4G4B4(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDevice4444FormatsFeaturesEXT#formatA4B4G4R4} field. */
        public VkPhysicalDevice4444FormatsFeaturesEXT.Buffer formatA4B4G4R4(@NativeType("VkBool32") boolean value) { VkPhysicalDevice4444FormatsFeaturesEXT.nformatA4B4G4R4(address(), value ? 1 : 0); return this; }

    }

}