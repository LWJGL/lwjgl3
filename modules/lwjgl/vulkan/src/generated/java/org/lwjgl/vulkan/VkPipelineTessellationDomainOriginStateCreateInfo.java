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
 * Structure specifying the orientation of the tessellation domain.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkPipelineTessellationDomainOriginStateCreateInfo} structure is included in the {@code pNext} chain of {@link VkPipelineTessellationStateCreateInfo}, it controls the origin of the tessellation domain. If this structure is not present, it is as if {@code domainOrigin} were {@link VK11#VK_TESSELLATION_DOMAIN_ORIGIN_UPPER_LEFT TESSELLATION_DOMAIN_ORIGIN_UPPER_LEFT}.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK11#VK_STRUCTURE_TYPE_PIPELINE_TESSELLATION_DOMAIN_ORIGIN_STATE_CREATE_INFO STRUCTURE_TYPE_PIPELINE_TESSELLATION_DOMAIN_ORIGIN_STATE_CREATE_INFO}</li>
 * <li>{@code domainOrigin} <b>must</b> be a valid {@code VkTessellationDomainOrigin} value</li>
 * </ul>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code domainOrigin} &ndash; controls the origin of the tessellation domain space, and is of type {@code VkTessellationDomainOrigin}.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPipelineTessellationDomainOriginStateCreateInfo {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkTessellationDomainOrigin domainOrigin;
 * }</code></pre>
 */
public class VkPipelineTessellationDomainOriginStateCreateInfo extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        DOMAINORIGIN;

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
        DOMAINORIGIN = layout.offsetof(2);
    }

    VkPipelineTessellationDomainOriginStateCreateInfo(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VkPipelineTessellationDomainOriginStateCreateInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPipelineTessellationDomainOriginStateCreateInfo(ByteBuffer container) {
        this(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** Returns the value of the {@code pNext} field. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** Returns the value of the {@code domainOrigin} field. */
    @NativeType("VkTessellationDomainOrigin")
    public int domainOrigin() { return ndomainOrigin(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkPipelineTessellationDomainOriginStateCreateInfo sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPipelineTessellationDomainOriginStateCreateInfo pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code domainOrigin} field. */
    public VkPipelineTessellationDomainOriginStateCreateInfo domainOrigin(@NativeType("VkTessellationDomainOrigin") int value) { ndomainOrigin(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPipelineTessellationDomainOriginStateCreateInfo set(
        int sType,
        long pNext,
        int domainOrigin
    ) {
        sType(sType);
        pNext(pNext);
        domainOrigin(domainOrigin);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPipelineTessellationDomainOriginStateCreateInfo set(VkPipelineTessellationDomainOriginStateCreateInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link VkPipelineTessellationDomainOriginStateCreateInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPipelineTessellationDomainOriginStateCreateInfo malloc() {
        return create(nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@link VkPipelineTessellationDomainOriginStateCreateInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPipelineTessellationDomainOriginStateCreateInfo calloc() {
        return create(nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@link VkPipelineTessellationDomainOriginStateCreateInfo} instance allocated with {@link BufferUtils}. */
    public static VkPipelineTessellationDomainOriginStateCreateInfo create() {
        return new VkPipelineTessellationDomainOriginStateCreateInfo(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link VkPipelineTessellationDomainOriginStateCreateInfo} instance for the specified memory address. */
    public static VkPipelineTessellationDomainOriginStateCreateInfo create(long address) {
        return new VkPipelineTessellationDomainOriginStateCreateInfo(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPipelineTessellationDomainOriginStateCreateInfo createSafe(long address) {
        return address == NULL ? null : create(address);
    }

    /**
     * Returns a new {@link VkPipelineTessellationDomainOriginStateCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineTessellationDomainOriginStateCreateInfo.Buffer malloc(int capacity) {
        return create(__malloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineTessellationDomainOriginStateCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineTessellationDomainOriginStateCreateInfo.Buffer calloc(int capacity) {
        return create(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineTessellationDomainOriginStateCreateInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineTessellationDomainOriginStateCreateInfo.Buffer create(int capacity) {
        return new Buffer(__create(capacity, SIZEOF));
    }

    /**
     * Create a {@link VkPipelineTessellationDomainOriginStateCreateInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPipelineTessellationDomainOriginStateCreateInfo.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPipelineTessellationDomainOriginStateCreateInfo.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : create(address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link VkPipelineTessellationDomainOriginStateCreateInfo} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkPipelineTessellationDomainOriginStateCreateInfo mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link VkPipelineTessellationDomainOriginStateCreateInfo} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkPipelineTessellationDomainOriginStateCreateInfo callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link VkPipelineTessellationDomainOriginStateCreateInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineTessellationDomainOriginStateCreateInfo mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link VkPipelineTessellationDomainOriginStateCreateInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineTessellationDomainOriginStateCreateInfo callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPipelineTessellationDomainOriginStateCreateInfo.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineTessellationDomainOriginStateCreateInfo.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkPipelineTessellationDomainOriginStateCreateInfo.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineTessellationDomainOriginStateCreateInfo.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkPipelineTessellationDomainOriginStateCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPipelineTessellationDomainOriginStateCreateInfo.Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineTessellationDomainOriginStateCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPipelineTessellationDomainOriginStateCreateInfo.Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPipelineTessellationDomainOriginStateCreateInfo.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPipelineTessellationDomainOriginStateCreateInfo.PNEXT); }
    /** Unsafe version of {@link #domainOrigin}. */
    public static int ndomainOrigin(long struct) { return memGetInt(struct + VkPipelineTessellationDomainOriginStateCreateInfo.DOMAINORIGIN); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPipelineTessellationDomainOriginStateCreateInfo.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPipelineTessellationDomainOriginStateCreateInfo.PNEXT, value); }
    /** Unsafe version of {@link #domainOrigin(int) domainOrigin}. */
    public static void ndomainOrigin(long struct, int value) { memPutInt(struct + VkPipelineTessellationDomainOriginStateCreateInfo.DOMAINORIGIN, value); }

    // -----------------------------------

    /** An array of {@link VkPipelineTessellationDomainOriginStateCreateInfo} structs. */
    public static class Buffer extends StructBuffer<VkPipelineTessellationDomainOriginStateCreateInfo, Buffer> implements NativeResource {

        /**
         * Creates a new {@link VkPipelineTessellationDomainOriginStateCreateInfo.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPipelineTessellationDomainOriginStateCreateInfo#SIZEOF}, and its mark will be undefined.
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
        protected Buffer newBufferInstance(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            return new Buffer(address, container, mark, pos, lim, cap);
        }

        @Override
        protected VkPipelineTessellationDomainOriginStateCreateInfo newInstance(long address) {
            return new VkPipelineTessellationDomainOriginStateCreateInfo(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPipelineTessellationDomainOriginStateCreateInfo.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkPipelineTessellationDomainOriginStateCreateInfo.npNext(address()); }
        /** Returns the value of the {@code domainOrigin} field. */
        @NativeType("VkTessellationDomainOrigin")
        public int domainOrigin() { return VkPipelineTessellationDomainOriginStateCreateInfo.ndomainOrigin(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkPipelineTessellationDomainOriginStateCreateInfo.Buffer sType(@NativeType("VkStructureType") int value) { VkPipelineTessellationDomainOriginStateCreateInfo.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPipelineTessellationDomainOriginStateCreateInfo.Buffer pNext(@NativeType("void const *") long value) { VkPipelineTessellationDomainOriginStateCreateInfo.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code domainOrigin} field. */
        public VkPipelineTessellationDomainOriginStateCreateInfo.Buffer domainOrigin(@NativeType("VkTessellationDomainOrigin") int value) { VkPipelineTessellationDomainOriginStateCreateInfo.ndomainOrigin(address(), value); return this; }

    }

}