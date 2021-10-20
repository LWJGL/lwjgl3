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
 * Structure specifying parameters of a newly created pipeline tessellation state.
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code patchControlPoints} <b>must</b> be greater than zero and less than or equal to {@link VkPhysicalDeviceLimits}{@code ::maxTessellationPatchSize}</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK10#VK_STRUCTURE_TYPE_PIPELINE_TESSELLATION_STATE_CREATE_INFO STRUCTURE_TYPE_PIPELINE_TESSELLATION_STATE_CREATE_INFO}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL} or a pointer to a valid instance of {@link VkPipelineTessellationDomainOriginStateCreateInfo}</li>
 * <li>The {@code sType} value of each struct in the {@code pNext} chain <b>must</b> be unique</li>
 * <li>{@code flags} <b>must</b> be 0</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkGraphicsPipelineCreateInfo}, {@link VkGraphicsShaderGroupCreateInfoNV}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPipelineTessellationStateCreateInfo {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkPipelineTessellationStateCreateFlags {@link #flags};
 *     uint32_t {@link #patchControlPoints};
 * }</code></pre>
 */
public class VkPipelineTessellationStateCreateInfo extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FLAGS,
        PATCHCONTROLPOINTS;

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
        FLAGS = layout.offsetof(2);
        PATCHCONTROLPOINTS = layout.offsetof(3);
    }

    /**
     * Creates a {@code VkPipelineTessellationStateCreateInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPipelineTessellationStateCreateInfo(ByteBuffer container) {
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
    /** reserved for future use. */
    @NativeType("VkPipelineTessellationStateCreateFlags")
    public int flags() { return nflags(address()); }
    /** the number of control points per patch. */
    @NativeType("uint32_t")
    public int patchControlPoints() { return npatchControlPoints(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPipelineTessellationStateCreateInfo sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK10#VK_STRUCTURE_TYPE_PIPELINE_TESSELLATION_STATE_CREATE_INFO STRUCTURE_TYPE_PIPELINE_TESSELLATION_STATE_CREATE_INFO} value to the {@link #sType} field. */
    public VkPipelineTessellationStateCreateInfo sType$Default() { return sType(VK10.VK_STRUCTURE_TYPE_PIPELINE_TESSELLATION_STATE_CREATE_INFO); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPipelineTessellationStateCreateInfo pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Prepends the specified {@link VkPipelineTessellationDomainOriginStateCreateInfo} value to the {@code pNext} chain. */
    public VkPipelineTessellationStateCreateInfo pNext(VkPipelineTessellationDomainOriginStateCreateInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPipelineTessellationDomainOriginStateCreateInfoKHR} value to the {@code pNext} chain. */
    public VkPipelineTessellationStateCreateInfo pNext(VkPipelineTessellationDomainOriginStateCreateInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Sets the specified value to the {@link #flags} field. */
    public VkPipelineTessellationStateCreateInfo flags(@NativeType("VkPipelineTessellationStateCreateFlags") int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@link #patchControlPoints} field. */
    public VkPipelineTessellationStateCreateInfo patchControlPoints(@NativeType("uint32_t") int value) { npatchControlPoints(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPipelineTessellationStateCreateInfo set(
        int sType,
        long pNext,
        int flags,
        int patchControlPoints
    ) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        patchControlPoints(patchControlPoints);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPipelineTessellationStateCreateInfo set(VkPipelineTessellationStateCreateInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPipelineTessellationStateCreateInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPipelineTessellationStateCreateInfo malloc() {
        return wrap(VkPipelineTessellationStateCreateInfo.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPipelineTessellationStateCreateInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPipelineTessellationStateCreateInfo calloc() {
        return wrap(VkPipelineTessellationStateCreateInfo.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPipelineTessellationStateCreateInfo} instance allocated with {@link BufferUtils}. */
    public static VkPipelineTessellationStateCreateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPipelineTessellationStateCreateInfo.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPipelineTessellationStateCreateInfo} instance for the specified memory address. */
    public static VkPipelineTessellationStateCreateInfo create(long address) {
        return wrap(VkPipelineTessellationStateCreateInfo.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPipelineTessellationStateCreateInfo createSafe(long address) {
        return address == NULL ? null : wrap(VkPipelineTessellationStateCreateInfo.class, address);
    }

    /**
     * Returns a new {@link VkPipelineTessellationStateCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineTessellationStateCreateInfo.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPipelineTessellationStateCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineTessellationStateCreateInfo.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineTessellationStateCreateInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineTessellationStateCreateInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPipelineTessellationStateCreateInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPipelineTessellationStateCreateInfo.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPipelineTessellationStateCreateInfo.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPipelineTessellationStateCreateInfo mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPipelineTessellationStateCreateInfo callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPipelineTessellationStateCreateInfo mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPipelineTessellationStateCreateInfo callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPipelineTessellationStateCreateInfo.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPipelineTessellationStateCreateInfo.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPipelineTessellationStateCreateInfo.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPipelineTessellationStateCreateInfo.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkPipelineTessellationStateCreateInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineTessellationStateCreateInfo malloc(MemoryStack stack) {
        return wrap(VkPipelineTessellationStateCreateInfo.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPipelineTessellationStateCreateInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineTessellationStateCreateInfo calloc(MemoryStack stack) {
        return wrap(VkPipelineTessellationStateCreateInfo.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPipelineTessellationStateCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPipelineTessellationStateCreateInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineTessellationStateCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPipelineTessellationStateCreateInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPipelineTessellationStateCreateInfo.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPipelineTessellationStateCreateInfo.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return UNSAFE.getInt(null, struct + VkPipelineTessellationStateCreateInfo.FLAGS); }
    /** Unsafe version of {@link #patchControlPoints}. */
    public static int npatchControlPoints(long struct) { return UNSAFE.getInt(null, struct + VkPipelineTessellationStateCreateInfo.PATCHCONTROLPOINTS); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPipelineTessellationStateCreateInfo.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPipelineTessellationStateCreateInfo.PNEXT, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { UNSAFE.putInt(null, struct + VkPipelineTessellationStateCreateInfo.FLAGS, value); }
    /** Unsafe version of {@link #patchControlPoints(int) patchControlPoints}. */
    public static void npatchControlPoints(long struct, int value) { UNSAFE.putInt(null, struct + VkPipelineTessellationStateCreateInfo.PATCHCONTROLPOINTS, value); }

    // -----------------------------------

    /** An array of {@link VkPipelineTessellationStateCreateInfo} structs. */
    public static class Buffer extends StructBuffer<VkPipelineTessellationStateCreateInfo, Buffer> implements NativeResource {

        private static final VkPipelineTessellationStateCreateInfo ELEMENT_FACTORY = VkPipelineTessellationStateCreateInfo.create(-1L);

        /**
         * Creates a new {@code VkPipelineTessellationStateCreateInfo.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPipelineTessellationStateCreateInfo#SIZEOF}, and its mark will be undefined.
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
        protected VkPipelineTessellationStateCreateInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPipelineTessellationStateCreateInfo#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPipelineTessellationStateCreateInfo.nsType(address()); }
        /** @return the value of the {@link VkPipelineTessellationStateCreateInfo#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkPipelineTessellationStateCreateInfo.npNext(address()); }
        /** @return the value of the {@link VkPipelineTessellationStateCreateInfo#flags} field. */
        @NativeType("VkPipelineTessellationStateCreateFlags")
        public int flags() { return VkPipelineTessellationStateCreateInfo.nflags(address()); }
        /** @return the value of the {@link VkPipelineTessellationStateCreateInfo#patchControlPoints} field. */
        @NativeType("uint32_t")
        public int patchControlPoints() { return VkPipelineTessellationStateCreateInfo.npatchControlPoints(address()); }

        /** Sets the specified value to the {@link VkPipelineTessellationStateCreateInfo#sType} field. */
        public VkPipelineTessellationStateCreateInfo.Buffer sType(@NativeType("VkStructureType") int value) { VkPipelineTessellationStateCreateInfo.nsType(address(), value); return this; }
        /** Sets the {@link VK10#VK_STRUCTURE_TYPE_PIPELINE_TESSELLATION_STATE_CREATE_INFO STRUCTURE_TYPE_PIPELINE_TESSELLATION_STATE_CREATE_INFO} value to the {@link VkPipelineTessellationStateCreateInfo#sType} field. */
        public VkPipelineTessellationStateCreateInfo.Buffer sType$Default() { return sType(VK10.VK_STRUCTURE_TYPE_PIPELINE_TESSELLATION_STATE_CREATE_INFO); }
        /** Sets the specified value to the {@link VkPipelineTessellationStateCreateInfo#pNext} field. */
        public VkPipelineTessellationStateCreateInfo.Buffer pNext(@NativeType("void const *") long value) { VkPipelineTessellationStateCreateInfo.npNext(address(), value); return this; }
        /** Prepends the specified {@link VkPipelineTessellationDomainOriginStateCreateInfo} value to the {@code pNext} chain. */
        public VkPipelineTessellationStateCreateInfo.Buffer pNext(VkPipelineTessellationDomainOriginStateCreateInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPipelineTessellationDomainOriginStateCreateInfoKHR} value to the {@code pNext} chain. */
        public VkPipelineTessellationStateCreateInfo.Buffer pNext(VkPipelineTessellationDomainOriginStateCreateInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Sets the specified value to the {@link VkPipelineTessellationStateCreateInfo#flags} field. */
        public VkPipelineTessellationStateCreateInfo.Buffer flags(@NativeType("VkPipelineTessellationStateCreateFlags") int value) { VkPipelineTessellationStateCreateInfo.nflags(address(), value); return this; }
        /** Sets the specified value to the {@link VkPipelineTessellationStateCreateInfo#patchControlPoints} field. */
        public VkPipelineTessellationStateCreateInfo.Buffer patchControlPoints(@NativeType("uint32_t") int value) { VkPipelineTessellationStateCreateInfo.npatchControlPoints(address(), value); return this; }

    }

}