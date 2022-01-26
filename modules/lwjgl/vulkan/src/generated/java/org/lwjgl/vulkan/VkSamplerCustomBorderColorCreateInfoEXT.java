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
 * Structure specifying custom border color.
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>If provided {@code format} is not {@link VK10#VK_FORMAT_UNDEFINED FORMAT_UNDEFINED} then the {@link VkSamplerCreateInfo}{@code ::borderColor} type <b>must</b> match the sampled type of the provided {@code format}, as shown in the <em>SPIR-V Sampled Type</em> column of the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#formats-numericformat">Interpretation of Numeric Format</a> table</li>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-customBorderColorWithoutFormat">customBorderColorWithoutFormat</a> feature is not enabled then {@code format} <b>must</b> not be {@link VK10#VK_FORMAT_UNDEFINED FORMAT_UNDEFINED}</li>
 * <li>If the sampler is used to sample an image view of {@link VK10#VK_FORMAT_B4G4R4A4_UNORM_PACK16 FORMAT_B4G4R4A4_UNORM_PACK16}, {@link VK10#VK_FORMAT_B5G6R5_UNORM_PACK16 FORMAT_B5G6R5_UNORM_PACK16}, or {@link VK10#VK_FORMAT_B5G5R5A1_UNORM_PACK16 FORMAT_B5G5R5A1_UNORM_PACK16} format then {@code format} <b>must</b> not be {@link VK10#VK_FORMAT_UNDEFINED FORMAT_UNDEFINED}</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTCustomBorderColor#VK_STRUCTURE_TYPE_SAMPLER_CUSTOM_BORDER_COLOR_CREATE_INFO_EXT STRUCTURE_TYPE_SAMPLER_CUSTOM_BORDER_COLOR_CREATE_INFO_EXT}</li>
 * <li>{@code format} <b>must</b> be a valid {@code VkFormat} value</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkClearColorValue}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkSamplerCustomBorderColorCreateInfoEXT {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     {@link VkClearColorValue VkClearColorValue} {@link #customBorderColor};
 *     VkFormat {@link #format};
 * }</code></pre>
 */
public class VkSamplerCustomBorderColorCreateInfoEXT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        CUSTOMBORDERCOLOR,
        FORMAT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(VkClearColorValue.SIZEOF, VkClearColorValue.ALIGNOF),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        CUSTOMBORDERCOLOR = layout.offsetof(2);
        FORMAT = layout.offsetof(3);
    }

    /**
     * Creates a {@code VkSamplerCustomBorderColorCreateInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkSamplerCustomBorderColorCreateInfoEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the type of this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** a {@link VkClearColorValue} representing the desired custom sampler border color. */
    public VkClearColorValue customBorderColor() { return ncustomBorderColor(address()); }
    /** a {@code VkFormat} representing the format of the sampled image view(s). This field may be {@link VK10#VK_FORMAT_UNDEFINED FORMAT_UNDEFINED} if the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-customBorderColorWithoutFormat">customBorderColorWithoutFormat</a> feature is enabled. */
    @NativeType("VkFormat")
    public int format() { return nformat(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkSamplerCustomBorderColorCreateInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTCustomBorderColor#VK_STRUCTURE_TYPE_SAMPLER_CUSTOM_BORDER_COLOR_CREATE_INFO_EXT STRUCTURE_TYPE_SAMPLER_CUSTOM_BORDER_COLOR_CREATE_INFO_EXT} value to the {@link #sType} field. */
    public VkSamplerCustomBorderColorCreateInfoEXT sType$Default() { return sType(EXTCustomBorderColor.VK_STRUCTURE_TYPE_SAMPLER_CUSTOM_BORDER_COLOR_CREATE_INFO_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkSamplerCustomBorderColorCreateInfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Copies the specified {@link VkClearColorValue} to the {@link #customBorderColor} field. */
    public VkSamplerCustomBorderColorCreateInfoEXT customBorderColor(VkClearColorValue value) { ncustomBorderColor(address(), value); return this; }
    /** Passes the {@link #customBorderColor} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkSamplerCustomBorderColorCreateInfoEXT customBorderColor(java.util.function.Consumer<VkClearColorValue> consumer) { consumer.accept(customBorderColor()); return this; }
    /** Sets the specified value to the {@link #format} field. */
    public VkSamplerCustomBorderColorCreateInfoEXT format(@NativeType("VkFormat") int value) { nformat(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkSamplerCustomBorderColorCreateInfoEXT set(
        int sType,
        long pNext,
        VkClearColorValue customBorderColor,
        int format
    ) {
        sType(sType);
        pNext(pNext);
        customBorderColor(customBorderColor);
        format(format);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkSamplerCustomBorderColorCreateInfoEXT set(VkSamplerCustomBorderColorCreateInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkSamplerCustomBorderColorCreateInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkSamplerCustomBorderColorCreateInfoEXT malloc() {
        return wrap(VkSamplerCustomBorderColorCreateInfoEXT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkSamplerCustomBorderColorCreateInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkSamplerCustomBorderColorCreateInfoEXT calloc() {
        return wrap(VkSamplerCustomBorderColorCreateInfoEXT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkSamplerCustomBorderColorCreateInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkSamplerCustomBorderColorCreateInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkSamplerCustomBorderColorCreateInfoEXT.class, memAddress(container), container);
    }

    /** Returns a new {@code VkSamplerCustomBorderColorCreateInfoEXT} instance for the specified memory address. */
    public static VkSamplerCustomBorderColorCreateInfoEXT create(long address) {
        return wrap(VkSamplerCustomBorderColorCreateInfoEXT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkSamplerCustomBorderColorCreateInfoEXT createSafe(long address) {
        return address == NULL ? null : wrap(VkSamplerCustomBorderColorCreateInfoEXT.class, address);
    }

    /**
     * Returns a new {@link VkSamplerCustomBorderColorCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSamplerCustomBorderColorCreateInfoEXT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkSamplerCustomBorderColorCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSamplerCustomBorderColorCreateInfoEXT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSamplerCustomBorderColorCreateInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkSamplerCustomBorderColorCreateInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkSamplerCustomBorderColorCreateInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkSamplerCustomBorderColorCreateInfoEXT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkSamplerCustomBorderColorCreateInfoEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkSamplerCustomBorderColorCreateInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSamplerCustomBorderColorCreateInfoEXT malloc(MemoryStack stack) {
        return wrap(VkSamplerCustomBorderColorCreateInfoEXT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkSamplerCustomBorderColorCreateInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSamplerCustomBorderColorCreateInfoEXT calloc(MemoryStack stack) {
        return wrap(VkSamplerCustomBorderColorCreateInfoEXT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkSamplerCustomBorderColorCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSamplerCustomBorderColorCreateInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSamplerCustomBorderColorCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSamplerCustomBorderColorCreateInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkSamplerCustomBorderColorCreateInfoEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkSamplerCustomBorderColorCreateInfoEXT.PNEXT); }
    /** Unsafe version of {@link #customBorderColor}. */
    public static VkClearColorValue ncustomBorderColor(long struct) { return VkClearColorValue.create(struct + VkSamplerCustomBorderColorCreateInfoEXT.CUSTOMBORDERCOLOR); }
    /** Unsafe version of {@link #format}. */
    public static int nformat(long struct) { return UNSAFE.getInt(null, struct + VkSamplerCustomBorderColorCreateInfoEXT.FORMAT); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkSamplerCustomBorderColorCreateInfoEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkSamplerCustomBorderColorCreateInfoEXT.PNEXT, value); }
    /** Unsafe version of {@link #customBorderColor(VkClearColorValue) customBorderColor}. */
    public static void ncustomBorderColor(long struct, VkClearColorValue value) { memCopy(value.address(), struct + VkSamplerCustomBorderColorCreateInfoEXT.CUSTOMBORDERCOLOR, VkClearColorValue.SIZEOF); }
    /** Unsafe version of {@link #format(int) format}. */
    public static void nformat(long struct, int value) { UNSAFE.putInt(null, struct + VkSamplerCustomBorderColorCreateInfoEXT.FORMAT, value); }

    // -----------------------------------

    /** An array of {@link VkSamplerCustomBorderColorCreateInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkSamplerCustomBorderColorCreateInfoEXT, Buffer> implements NativeResource {

        private static final VkSamplerCustomBorderColorCreateInfoEXT ELEMENT_FACTORY = VkSamplerCustomBorderColorCreateInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkSamplerCustomBorderColorCreateInfoEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkSamplerCustomBorderColorCreateInfoEXT#SIZEOF}, and its mark will be undefined.
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
        protected VkSamplerCustomBorderColorCreateInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkSamplerCustomBorderColorCreateInfoEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkSamplerCustomBorderColorCreateInfoEXT.nsType(address()); }
        /** @return the value of the {@link VkSamplerCustomBorderColorCreateInfoEXT#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkSamplerCustomBorderColorCreateInfoEXT.npNext(address()); }
        /** @return a {@link VkClearColorValue} view of the {@link VkSamplerCustomBorderColorCreateInfoEXT#customBorderColor} field. */
        public VkClearColorValue customBorderColor() { return VkSamplerCustomBorderColorCreateInfoEXT.ncustomBorderColor(address()); }
        /** @return the value of the {@link VkSamplerCustomBorderColorCreateInfoEXT#format} field. */
        @NativeType("VkFormat")
        public int format() { return VkSamplerCustomBorderColorCreateInfoEXT.nformat(address()); }

        /** Sets the specified value to the {@link VkSamplerCustomBorderColorCreateInfoEXT#sType} field. */
        public VkSamplerCustomBorderColorCreateInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkSamplerCustomBorderColorCreateInfoEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTCustomBorderColor#VK_STRUCTURE_TYPE_SAMPLER_CUSTOM_BORDER_COLOR_CREATE_INFO_EXT STRUCTURE_TYPE_SAMPLER_CUSTOM_BORDER_COLOR_CREATE_INFO_EXT} value to the {@link VkSamplerCustomBorderColorCreateInfoEXT#sType} field. */
        public VkSamplerCustomBorderColorCreateInfoEXT.Buffer sType$Default() { return sType(EXTCustomBorderColor.VK_STRUCTURE_TYPE_SAMPLER_CUSTOM_BORDER_COLOR_CREATE_INFO_EXT); }
        /** Sets the specified value to the {@link VkSamplerCustomBorderColorCreateInfoEXT#pNext} field. */
        public VkSamplerCustomBorderColorCreateInfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkSamplerCustomBorderColorCreateInfoEXT.npNext(address(), value); return this; }
        /** Copies the specified {@link VkClearColorValue} to the {@link VkSamplerCustomBorderColorCreateInfoEXT#customBorderColor} field. */
        public VkSamplerCustomBorderColorCreateInfoEXT.Buffer customBorderColor(VkClearColorValue value) { VkSamplerCustomBorderColorCreateInfoEXT.ncustomBorderColor(address(), value); return this; }
        /** Passes the {@link VkSamplerCustomBorderColorCreateInfoEXT#customBorderColor} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkSamplerCustomBorderColorCreateInfoEXT.Buffer customBorderColor(java.util.function.Consumer<VkClearColorValue> consumer) { consumer.accept(customBorderColor()); return this; }
        /** Sets the specified value to the {@link VkSamplerCustomBorderColorCreateInfoEXT#format} field. */
        public VkSamplerCustomBorderColorCreateInfoEXT.Buffer format(@NativeType("VkFormat") int value) { VkSamplerCustomBorderColorCreateInfoEXT.nformat(address(), value); return this; }

    }

}