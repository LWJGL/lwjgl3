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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Structure specifying color write state of a newly created pipeline.
 * 
 * <h5>Description</h5>
 * 
 * <p>When this structure is included in the {@code pNext} chain of {@link VkPipelineColorBlendStateCreateInfo}, it defines per-attachment color write state. If this structure is not included in the {@code pNext} chain, it is equivalent to specifying this structure with {@code attachmentCount} equal to the {@code attachmentCount} member of {@link VkPipelineColorBlendStateCreateInfo}, and {@code pColorWriteEnables} pointing to an array of as many {@link VK10#VK_TRUE TRUE} values.</p>
 * 
 * <p>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-colorWriteEnable">colorWriteEnable</a> feature is not enabled on the device, all {@code VkBool32} elements in the {@code pColorWriteEnables} array <b>must</b> be {@link VK10#VK_TRUE TRUE}.</p>
 * 
 * <p>Color Write Enable interacts with the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#framebuffer-color-write-mask">Color Write Mask</a> as follows:</p>
 * 
 * <ul>
 * <li>If {@code colorWriteEnable} is {@link VK10#VK_TRUE TRUE}, writes to the attachment are determined by the {@code colorWriteMask}.</li>
 * <li>If {@code colorWriteEnable} is {@link VK10#VK_FALSE FALSE}, the {@code colorWriteMask} is ignored and writes to all components of the attachment are disabled. This is equivalent to specifying a {@code colorWriteMask} of 0.</li>
 * </ul>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-colorWriteEnable">colorWriteEnable</a> feature is not enabled, all elements of {@code pColorWriteEnables} <b>must</b> be {@link VK10#VK_TRUE TRUE}</li>
 * <li>{@code attachmentCount} <b>must</b> be equal to the {@code attachmentCount} member of the {@link VkPipelineColorBlendStateCreateInfo} structure specified during pipeline creation</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTColorWriteEnable#VK_STRUCTURE_TYPE_PIPELINE_COLOR_WRITE_CREATE_INFO_EXT STRUCTURE_TYPE_PIPELINE_COLOR_WRITE_CREATE_INFO_EXT}</li>
 * <li>If {@code attachmentCount} is not 0, {@code pColorWriteEnables} <b>must</b> be a valid pointer to an array of {@code attachmentCount} {@code VkBool32} values</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPipelineColorWriteCreateInfoEXT {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     uint32_t {@link #attachmentCount};
 *     VkBool32 const * {@link #pColorWriteEnables};
 * }</code></pre>
 */
public class VkPipelineColorWriteCreateInfoEXT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        ATTACHMENTCOUNT,
        PCOLORWRITEENABLES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        ATTACHMENTCOUNT = layout.offsetof(2);
        PCOLORWRITEENABLES = layout.offsetof(3);
    }

    /**
     * Creates a {@code VkPipelineColorWriteCreateInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPipelineColorWriteCreateInfoEXT(ByteBuffer container) {
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
    /** the number of {@code VkBool32} elements in {@code pColorWriteEnables}. */
    @NativeType("uint32_t")
    public int attachmentCount() { return nattachmentCount(address()); }
    /** a pointer to an array of per target attachment boolean values specifying whether color writes are enabled for the given attachment. */
    @Nullable
    @NativeType("VkBool32 const *")
    public IntBuffer pColorWriteEnables() { return npColorWriteEnables(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPipelineColorWriteCreateInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTColorWriteEnable#VK_STRUCTURE_TYPE_PIPELINE_COLOR_WRITE_CREATE_INFO_EXT STRUCTURE_TYPE_PIPELINE_COLOR_WRITE_CREATE_INFO_EXT} value to the {@link #sType} field. */
    public VkPipelineColorWriteCreateInfoEXT sType$Default() { return sType(EXTColorWriteEnable.VK_STRUCTURE_TYPE_PIPELINE_COLOR_WRITE_CREATE_INFO_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPipelineColorWriteCreateInfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@link #pColorWriteEnables} field. */
    public VkPipelineColorWriteCreateInfoEXT pColorWriteEnables(@Nullable @NativeType("VkBool32 const *") IntBuffer value) { npColorWriteEnables(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPipelineColorWriteCreateInfoEXT set(
        int sType,
        long pNext,
        @Nullable IntBuffer pColorWriteEnables
    ) {
        sType(sType);
        pNext(pNext);
        pColorWriteEnables(pColorWriteEnables);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPipelineColorWriteCreateInfoEXT set(VkPipelineColorWriteCreateInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPipelineColorWriteCreateInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPipelineColorWriteCreateInfoEXT malloc() {
        return wrap(VkPipelineColorWriteCreateInfoEXT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPipelineColorWriteCreateInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPipelineColorWriteCreateInfoEXT calloc() {
        return wrap(VkPipelineColorWriteCreateInfoEXT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPipelineColorWriteCreateInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkPipelineColorWriteCreateInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPipelineColorWriteCreateInfoEXT.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPipelineColorWriteCreateInfoEXT} instance for the specified memory address. */
    public static VkPipelineColorWriteCreateInfoEXT create(long address) {
        return wrap(VkPipelineColorWriteCreateInfoEXT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPipelineColorWriteCreateInfoEXT createSafe(long address) {
        return address == NULL ? null : wrap(VkPipelineColorWriteCreateInfoEXT.class, address);
    }

    /**
     * Returns a new {@link VkPipelineColorWriteCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineColorWriteCreateInfoEXT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPipelineColorWriteCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineColorWriteCreateInfoEXT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineColorWriteCreateInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineColorWriteCreateInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPipelineColorWriteCreateInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPipelineColorWriteCreateInfoEXT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPipelineColorWriteCreateInfoEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkPipelineColorWriteCreateInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineColorWriteCreateInfoEXT malloc(MemoryStack stack) {
        return wrap(VkPipelineColorWriteCreateInfoEXT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPipelineColorWriteCreateInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineColorWriteCreateInfoEXT calloc(MemoryStack stack) {
        return wrap(VkPipelineColorWriteCreateInfoEXT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPipelineColorWriteCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPipelineColorWriteCreateInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineColorWriteCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPipelineColorWriteCreateInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPipelineColorWriteCreateInfoEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPipelineColorWriteCreateInfoEXT.PNEXT); }
    /** Unsafe version of {@link #attachmentCount}. */
    public static int nattachmentCount(long struct) { return UNSAFE.getInt(null, struct + VkPipelineColorWriteCreateInfoEXT.ATTACHMENTCOUNT); }
    /** Unsafe version of {@link #pColorWriteEnables() pColorWriteEnables}. */
    @Nullable public static IntBuffer npColorWriteEnables(long struct) { return memIntBufferSafe(memGetAddress(struct + VkPipelineColorWriteCreateInfoEXT.PCOLORWRITEENABLES), nattachmentCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPipelineColorWriteCreateInfoEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPipelineColorWriteCreateInfoEXT.PNEXT, value); }
    /** Sets the specified value to the {@code attachmentCount} field of the specified {@code struct}. */
    public static void nattachmentCount(long struct, int value) { UNSAFE.putInt(null, struct + VkPipelineColorWriteCreateInfoEXT.ATTACHMENTCOUNT, value); }
    /** Unsafe version of {@link #pColorWriteEnables(IntBuffer) pColorWriteEnables}. */
    public static void npColorWriteEnables(long struct, @Nullable IntBuffer value) { memPutAddress(struct + VkPipelineColorWriteCreateInfoEXT.PCOLORWRITEENABLES, memAddressSafe(value)); nattachmentCount(struct, value == null ? 0 : value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        if (nattachmentCount(struct) != 0) {
            check(memGetAddress(struct + VkPipelineColorWriteCreateInfoEXT.PCOLORWRITEENABLES));
        }
    }

    // -----------------------------------

    /** An array of {@link VkPipelineColorWriteCreateInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkPipelineColorWriteCreateInfoEXT, Buffer> implements NativeResource {

        private static final VkPipelineColorWriteCreateInfoEXT ELEMENT_FACTORY = VkPipelineColorWriteCreateInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkPipelineColorWriteCreateInfoEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPipelineColorWriteCreateInfoEXT#SIZEOF}, and its mark will be undefined.
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
        protected VkPipelineColorWriteCreateInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPipelineColorWriteCreateInfoEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPipelineColorWriteCreateInfoEXT.nsType(address()); }
        /** @return the value of the {@link VkPipelineColorWriteCreateInfoEXT#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkPipelineColorWriteCreateInfoEXT.npNext(address()); }
        /** @return the value of the {@link VkPipelineColorWriteCreateInfoEXT#attachmentCount} field. */
        @NativeType("uint32_t")
        public int attachmentCount() { return VkPipelineColorWriteCreateInfoEXT.nattachmentCount(address()); }
        /** @return a {@link IntBuffer} view of the data pointed to by the {@link VkPipelineColorWriteCreateInfoEXT#pColorWriteEnables} field. */
        @Nullable
        @NativeType("VkBool32 const *")
        public IntBuffer pColorWriteEnables() { return VkPipelineColorWriteCreateInfoEXT.npColorWriteEnables(address()); }

        /** Sets the specified value to the {@link VkPipelineColorWriteCreateInfoEXT#sType} field. */
        public VkPipelineColorWriteCreateInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPipelineColorWriteCreateInfoEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTColorWriteEnable#VK_STRUCTURE_TYPE_PIPELINE_COLOR_WRITE_CREATE_INFO_EXT STRUCTURE_TYPE_PIPELINE_COLOR_WRITE_CREATE_INFO_EXT} value to the {@link VkPipelineColorWriteCreateInfoEXT#sType} field. */
        public VkPipelineColorWriteCreateInfoEXT.Buffer sType$Default() { return sType(EXTColorWriteEnable.VK_STRUCTURE_TYPE_PIPELINE_COLOR_WRITE_CREATE_INFO_EXT); }
        /** Sets the specified value to the {@link VkPipelineColorWriteCreateInfoEXT#pNext} field. */
        public VkPipelineColorWriteCreateInfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkPipelineColorWriteCreateInfoEXT.npNext(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@link VkPipelineColorWriteCreateInfoEXT#pColorWriteEnables} field. */
        public VkPipelineColorWriteCreateInfoEXT.Buffer pColorWriteEnables(@Nullable @NativeType("VkBool32 const *") IntBuffer value) { VkPipelineColorWriteCreateInfoEXT.npColorWriteEnables(address(), value); return this; }

    }

}