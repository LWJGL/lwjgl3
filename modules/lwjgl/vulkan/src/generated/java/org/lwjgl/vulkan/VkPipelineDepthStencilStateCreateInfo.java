/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre><code>
 * struct VkPipelineDepthStencilStateCreateInfo {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkPipelineDepthStencilStateCreateFlags flags;
 *     VkBool32 depthTestEnable;
 *     VkBool32 depthWriteEnable;
 *     VkCompareOp depthCompareOp;
 *     VkBool32 depthBoundsTestEnable;
 *     VkBool32 stencilTestEnable;
 *     {@link VkStencilOpState VkStencilOpState} front;
 *     {@link VkStencilOpState VkStencilOpState} back;
 *     float minDepthBounds;
 *     float maxDepthBounds;
 * }</code></pre>
 */
public class VkPipelineDepthStencilStateCreateInfo extends Struct<VkPipelineDepthStencilStateCreateInfo> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FLAGS,
        DEPTHTESTENABLE,
        DEPTHWRITEENABLE,
        DEPTHCOMPAREOP,
        DEPTHBOUNDSTESTENABLE,
        STENCILTESTENABLE,
        FRONT,
        BACK,
        MINDEPTHBOUNDS,
        MAXDEPTHBOUNDS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(VkStencilOpState.SIZEOF, VkStencilOpState.ALIGNOF),
            __member(VkStencilOpState.SIZEOF, VkStencilOpState.ALIGNOF),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        DEPTHTESTENABLE = layout.offsetof(3);
        DEPTHWRITEENABLE = layout.offsetof(4);
        DEPTHCOMPAREOP = layout.offsetof(5);
        DEPTHBOUNDSTESTENABLE = layout.offsetof(6);
        STENCILTESTENABLE = layout.offsetof(7);
        FRONT = layout.offsetof(8);
        BACK = layout.offsetof(9);
        MINDEPTHBOUNDS = layout.offsetof(10);
        MAXDEPTHBOUNDS = layout.offsetof(11);
    }

    protected VkPipelineDepthStencilStateCreateInfo(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPipelineDepthStencilStateCreateInfo create(long address, @Nullable ByteBuffer container) {
        return new VkPipelineDepthStencilStateCreateInfo(address, container);
    }

    /**
     * Creates a {@code VkPipelineDepthStencilStateCreateInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPipelineDepthStencilStateCreateInfo(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** @return the value of the {@code pNext} field. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** @return the value of the {@code flags} field. */
    @NativeType("VkPipelineDepthStencilStateCreateFlags")
    public int flags() { return nflags(address()); }
    /** @return the value of the {@code depthTestEnable} field. */
    @NativeType("VkBool32")
    public boolean depthTestEnable() { return ndepthTestEnable(address()) != 0; }
    /** @return the value of the {@code depthWriteEnable} field. */
    @NativeType("VkBool32")
    public boolean depthWriteEnable() { return ndepthWriteEnable(address()) != 0; }
    /** @return the value of the {@code depthCompareOp} field. */
    @NativeType("VkCompareOp")
    public int depthCompareOp() { return ndepthCompareOp(address()); }
    /** @return the value of the {@code depthBoundsTestEnable} field. */
    @NativeType("VkBool32")
    public boolean depthBoundsTestEnable() { return ndepthBoundsTestEnable(address()) != 0; }
    /** @return the value of the {@code stencilTestEnable} field. */
    @NativeType("VkBool32")
    public boolean stencilTestEnable() { return nstencilTestEnable(address()) != 0; }
    /** @return a {@link VkStencilOpState} view of the {@code front} field. */
    public VkStencilOpState front() { return nfront(address()); }
    /** @return a {@link VkStencilOpState} view of the {@code back} field. */
    public VkStencilOpState back() { return nback(address()); }
    /** @return the value of the {@code minDepthBounds} field. */
    public float minDepthBounds() { return nminDepthBounds(address()); }
    /** @return the value of the {@code maxDepthBounds} field. */
    public float maxDepthBounds() { return nmaxDepthBounds(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkPipelineDepthStencilStateCreateInfo sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK10#VK_STRUCTURE_TYPE_PIPELINE_DEPTH_STENCIL_STATE_CREATE_INFO STRUCTURE_TYPE_PIPELINE_DEPTH_STENCIL_STATE_CREATE_INFO} value to the {@code sType} field. */
    public VkPipelineDepthStencilStateCreateInfo sType$Default() { return sType(VK10.VK_STRUCTURE_TYPE_PIPELINE_DEPTH_STENCIL_STATE_CREATE_INFO); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPipelineDepthStencilStateCreateInfo pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code flags} field. */
    public VkPipelineDepthStencilStateCreateInfo flags(@NativeType("VkPipelineDepthStencilStateCreateFlags") int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@code depthTestEnable} field. */
    public VkPipelineDepthStencilStateCreateInfo depthTestEnable(@NativeType("VkBool32") boolean value) { ndepthTestEnable(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code depthWriteEnable} field. */
    public VkPipelineDepthStencilStateCreateInfo depthWriteEnable(@NativeType("VkBool32") boolean value) { ndepthWriteEnable(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code depthCompareOp} field. */
    public VkPipelineDepthStencilStateCreateInfo depthCompareOp(@NativeType("VkCompareOp") int value) { ndepthCompareOp(address(), value); return this; }
    /** Sets the specified value to the {@code depthBoundsTestEnable} field. */
    public VkPipelineDepthStencilStateCreateInfo depthBoundsTestEnable(@NativeType("VkBool32") boolean value) { ndepthBoundsTestEnable(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code stencilTestEnable} field. */
    public VkPipelineDepthStencilStateCreateInfo stencilTestEnable(@NativeType("VkBool32") boolean value) { nstencilTestEnable(address(), value ? 1 : 0); return this; }
    /** Copies the specified {@link VkStencilOpState} to the {@code front} field. */
    public VkPipelineDepthStencilStateCreateInfo front(VkStencilOpState value) { nfront(address(), value); return this; }
    /** Passes the {@code front} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkPipelineDepthStencilStateCreateInfo front(java.util.function.Consumer<VkStencilOpState> consumer) { consumer.accept(front()); return this; }
    /** Copies the specified {@link VkStencilOpState} to the {@code back} field. */
    public VkPipelineDepthStencilStateCreateInfo back(VkStencilOpState value) { nback(address(), value); return this; }
    /** Passes the {@code back} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkPipelineDepthStencilStateCreateInfo back(java.util.function.Consumer<VkStencilOpState> consumer) { consumer.accept(back()); return this; }
    /** Sets the specified value to the {@code minDepthBounds} field. */
    public VkPipelineDepthStencilStateCreateInfo minDepthBounds(float value) { nminDepthBounds(address(), value); return this; }
    /** Sets the specified value to the {@code maxDepthBounds} field. */
    public VkPipelineDepthStencilStateCreateInfo maxDepthBounds(float value) { nmaxDepthBounds(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPipelineDepthStencilStateCreateInfo set(
        int sType,
        long pNext,
        int flags,
        boolean depthTestEnable,
        boolean depthWriteEnable,
        int depthCompareOp,
        boolean depthBoundsTestEnable,
        boolean stencilTestEnable,
        VkStencilOpState front,
        VkStencilOpState back,
        float minDepthBounds,
        float maxDepthBounds
    ) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        depthTestEnable(depthTestEnable);
        depthWriteEnable(depthWriteEnable);
        depthCompareOp(depthCompareOp);
        depthBoundsTestEnable(depthBoundsTestEnable);
        stencilTestEnable(stencilTestEnable);
        front(front);
        back(back);
        minDepthBounds(minDepthBounds);
        maxDepthBounds(maxDepthBounds);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPipelineDepthStencilStateCreateInfo set(VkPipelineDepthStencilStateCreateInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPipelineDepthStencilStateCreateInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPipelineDepthStencilStateCreateInfo malloc() {
        return new VkPipelineDepthStencilStateCreateInfo(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPipelineDepthStencilStateCreateInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPipelineDepthStencilStateCreateInfo calloc() {
        return new VkPipelineDepthStencilStateCreateInfo(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPipelineDepthStencilStateCreateInfo} instance allocated with {@link BufferUtils}. */
    public static VkPipelineDepthStencilStateCreateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPipelineDepthStencilStateCreateInfo(memAddress(container), container);
    }

    /** Returns a new {@code VkPipelineDepthStencilStateCreateInfo} instance for the specified memory address. */
    public static VkPipelineDepthStencilStateCreateInfo create(long address) {
        return new VkPipelineDepthStencilStateCreateInfo(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPipelineDepthStencilStateCreateInfo createSafe(long address) {
        return address == NULL ? null : new VkPipelineDepthStencilStateCreateInfo(address, null);
    }

    /**
     * Returns a new {@link VkPipelineDepthStencilStateCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineDepthStencilStateCreateInfo.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPipelineDepthStencilStateCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineDepthStencilStateCreateInfo.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineDepthStencilStateCreateInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineDepthStencilStateCreateInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPipelineDepthStencilStateCreateInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPipelineDepthStencilStateCreateInfo.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPipelineDepthStencilStateCreateInfo.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPipelineDepthStencilStateCreateInfo mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPipelineDepthStencilStateCreateInfo callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPipelineDepthStencilStateCreateInfo mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPipelineDepthStencilStateCreateInfo callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPipelineDepthStencilStateCreateInfo.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPipelineDepthStencilStateCreateInfo.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPipelineDepthStencilStateCreateInfo.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPipelineDepthStencilStateCreateInfo.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkPipelineDepthStencilStateCreateInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineDepthStencilStateCreateInfo malloc(MemoryStack stack) {
        return new VkPipelineDepthStencilStateCreateInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPipelineDepthStencilStateCreateInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineDepthStencilStateCreateInfo calloc(MemoryStack stack) {
        return new VkPipelineDepthStencilStateCreateInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPipelineDepthStencilStateCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPipelineDepthStencilStateCreateInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineDepthStencilStateCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPipelineDepthStencilStateCreateInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPipelineDepthStencilStateCreateInfo.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPipelineDepthStencilStateCreateInfo.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return memGetInt(struct + VkPipelineDepthStencilStateCreateInfo.FLAGS); }
    /** Unsafe version of {@link #depthTestEnable}. */
    public static int ndepthTestEnable(long struct) { return memGetInt(struct + VkPipelineDepthStencilStateCreateInfo.DEPTHTESTENABLE); }
    /** Unsafe version of {@link #depthWriteEnable}. */
    public static int ndepthWriteEnable(long struct) { return memGetInt(struct + VkPipelineDepthStencilStateCreateInfo.DEPTHWRITEENABLE); }
    /** Unsafe version of {@link #depthCompareOp}. */
    public static int ndepthCompareOp(long struct) { return memGetInt(struct + VkPipelineDepthStencilStateCreateInfo.DEPTHCOMPAREOP); }
    /** Unsafe version of {@link #depthBoundsTestEnable}. */
    public static int ndepthBoundsTestEnable(long struct) { return memGetInt(struct + VkPipelineDepthStencilStateCreateInfo.DEPTHBOUNDSTESTENABLE); }
    /** Unsafe version of {@link #stencilTestEnable}. */
    public static int nstencilTestEnable(long struct) { return memGetInt(struct + VkPipelineDepthStencilStateCreateInfo.STENCILTESTENABLE); }
    /** Unsafe version of {@link #front}. */
    public static VkStencilOpState nfront(long struct) { return VkStencilOpState.create(struct + VkPipelineDepthStencilStateCreateInfo.FRONT); }
    /** Unsafe version of {@link #back}. */
    public static VkStencilOpState nback(long struct) { return VkStencilOpState.create(struct + VkPipelineDepthStencilStateCreateInfo.BACK); }
    /** Unsafe version of {@link #minDepthBounds}. */
    public static float nminDepthBounds(long struct) { return memGetFloat(struct + VkPipelineDepthStencilStateCreateInfo.MINDEPTHBOUNDS); }
    /** Unsafe version of {@link #maxDepthBounds}. */
    public static float nmaxDepthBounds(long struct) { return memGetFloat(struct + VkPipelineDepthStencilStateCreateInfo.MAXDEPTHBOUNDS); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPipelineDepthStencilStateCreateInfo.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPipelineDepthStencilStateCreateInfo.PNEXT, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { memPutInt(struct + VkPipelineDepthStencilStateCreateInfo.FLAGS, value); }
    /** Unsafe version of {@link #depthTestEnable(boolean) depthTestEnable}. */
    public static void ndepthTestEnable(long struct, int value) { memPutInt(struct + VkPipelineDepthStencilStateCreateInfo.DEPTHTESTENABLE, value); }
    /** Unsafe version of {@link #depthWriteEnable(boolean) depthWriteEnable}. */
    public static void ndepthWriteEnable(long struct, int value) { memPutInt(struct + VkPipelineDepthStencilStateCreateInfo.DEPTHWRITEENABLE, value); }
    /** Unsafe version of {@link #depthCompareOp(int) depthCompareOp}. */
    public static void ndepthCompareOp(long struct, int value) { memPutInt(struct + VkPipelineDepthStencilStateCreateInfo.DEPTHCOMPAREOP, value); }
    /** Unsafe version of {@link #depthBoundsTestEnable(boolean) depthBoundsTestEnable}. */
    public static void ndepthBoundsTestEnable(long struct, int value) { memPutInt(struct + VkPipelineDepthStencilStateCreateInfo.DEPTHBOUNDSTESTENABLE, value); }
    /** Unsafe version of {@link #stencilTestEnable(boolean) stencilTestEnable}. */
    public static void nstencilTestEnable(long struct, int value) { memPutInt(struct + VkPipelineDepthStencilStateCreateInfo.STENCILTESTENABLE, value); }
    /** Unsafe version of {@link #front(VkStencilOpState) front}. */
    public static void nfront(long struct, VkStencilOpState value) { memCopy(value.address(), struct + VkPipelineDepthStencilStateCreateInfo.FRONT, VkStencilOpState.SIZEOF); }
    /** Unsafe version of {@link #back(VkStencilOpState) back}. */
    public static void nback(long struct, VkStencilOpState value) { memCopy(value.address(), struct + VkPipelineDepthStencilStateCreateInfo.BACK, VkStencilOpState.SIZEOF); }
    /** Unsafe version of {@link #minDepthBounds(float) minDepthBounds}. */
    public static void nminDepthBounds(long struct, float value) { memPutFloat(struct + VkPipelineDepthStencilStateCreateInfo.MINDEPTHBOUNDS, value); }
    /** Unsafe version of {@link #maxDepthBounds(float) maxDepthBounds}. */
    public static void nmaxDepthBounds(long struct, float value) { memPutFloat(struct + VkPipelineDepthStencilStateCreateInfo.MAXDEPTHBOUNDS, value); }

    // -----------------------------------

    /** An array of {@link VkPipelineDepthStencilStateCreateInfo} structs. */
    public static class Buffer extends StructBuffer<VkPipelineDepthStencilStateCreateInfo, Buffer> implements NativeResource {

        private static final VkPipelineDepthStencilStateCreateInfo ELEMENT_FACTORY = VkPipelineDepthStencilStateCreateInfo.create(-1L);

        /**
         * Creates a new {@code VkPipelineDepthStencilStateCreateInfo.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPipelineDepthStencilStateCreateInfo#SIZEOF}, and its mark will be undefined.</p>
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
        protected Buffer create(long address, @Nullable ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        @Override
        protected VkPipelineDepthStencilStateCreateInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPipelineDepthStencilStateCreateInfo.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkPipelineDepthStencilStateCreateInfo.npNext(address()); }
        /** @return the value of the {@code flags} field. */
        @NativeType("VkPipelineDepthStencilStateCreateFlags")
        public int flags() { return VkPipelineDepthStencilStateCreateInfo.nflags(address()); }
        /** @return the value of the {@code depthTestEnable} field. */
        @NativeType("VkBool32")
        public boolean depthTestEnable() { return VkPipelineDepthStencilStateCreateInfo.ndepthTestEnable(address()) != 0; }
        /** @return the value of the {@code depthWriteEnable} field. */
        @NativeType("VkBool32")
        public boolean depthWriteEnable() { return VkPipelineDepthStencilStateCreateInfo.ndepthWriteEnable(address()) != 0; }
        /** @return the value of the {@code depthCompareOp} field. */
        @NativeType("VkCompareOp")
        public int depthCompareOp() { return VkPipelineDepthStencilStateCreateInfo.ndepthCompareOp(address()); }
        /** @return the value of the {@code depthBoundsTestEnable} field. */
        @NativeType("VkBool32")
        public boolean depthBoundsTestEnable() { return VkPipelineDepthStencilStateCreateInfo.ndepthBoundsTestEnable(address()) != 0; }
        /** @return the value of the {@code stencilTestEnable} field. */
        @NativeType("VkBool32")
        public boolean stencilTestEnable() { return VkPipelineDepthStencilStateCreateInfo.nstencilTestEnable(address()) != 0; }
        /** @return a {@link VkStencilOpState} view of the {@code front} field. */
        public VkStencilOpState front() { return VkPipelineDepthStencilStateCreateInfo.nfront(address()); }
        /** @return a {@link VkStencilOpState} view of the {@code back} field. */
        public VkStencilOpState back() { return VkPipelineDepthStencilStateCreateInfo.nback(address()); }
        /** @return the value of the {@code minDepthBounds} field. */
        public float minDepthBounds() { return VkPipelineDepthStencilStateCreateInfo.nminDepthBounds(address()); }
        /** @return the value of the {@code maxDepthBounds} field. */
        public float maxDepthBounds() { return VkPipelineDepthStencilStateCreateInfo.nmaxDepthBounds(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkPipelineDepthStencilStateCreateInfo.Buffer sType(@NativeType("VkStructureType") int value) { VkPipelineDepthStencilStateCreateInfo.nsType(address(), value); return this; }
        /** Sets the {@link VK10#VK_STRUCTURE_TYPE_PIPELINE_DEPTH_STENCIL_STATE_CREATE_INFO STRUCTURE_TYPE_PIPELINE_DEPTH_STENCIL_STATE_CREATE_INFO} value to the {@code sType} field. */
        public VkPipelineDepthStencilStateCreateInfo.Buffer sType$Default() { return sType(VK10.VK_STRUCTURE_TYPE_PIPELINE_DEPTH_STENCIL_STATE_CREATE_INFO); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPipelineDepthStencilStateCreateInfo.Buffer pNext(@NativeType("void const *") long value) { VkPipelineDepthStencilStateCreateInfo.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code flags} field. */
        public VkPipelineDepthStencilStateCreateInfo.Buffer flags(@NativeType("VkPipelineDepthStencilStateCreateFlags") int value) { VkPipelineDepthStencilStateCreateInfo.nflags(address(), value); return this; }
        /** Sets the specified value to the {@code depthTestEnable} field. */
        public VkPipelineDepthStencilStateCreateInfo.Buffer depthTestEnable(@NativeType("VkBool32") boolean value) { VkPipelineDepthStencilStateCreateInfo.ndepthTestEnable(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code depthWriteEnable} field. */
        public VkPipelineDepthStencilStateCreateInfo.Buffer depthWriteEnable(@NativeType("VkBool32") boolean value) { VkPipelineDepthStencilStateCreateInfo.ndepthWriteEnable(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code depthCompareOp} field. */
        public VkPipelineDepthStencilStateCreateInfo.Buffer depthCompareOp(@NativeType("VkCompareOp") int value) { VkPipelineDepthStencilStateCreateInfo.ndepthCompareOp(address(), value); return this; }
        /** Sets the specified value to the {@code depthBoundsTestEnable} field. */
        public VkPipelineDepthStencilStateCreateInfo.Buffer depthBoundsTestEnable(@NativeType("VkBool32") boolean value) { VkPipelineDepthStencilStateCreateInfo.ndepthBoundsTestEnable(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code stencilTestEnable} field. */
        public VkPipelineDepthStencilStateCreateInfo.Buffer stencilTestEnable(@NativeType("VkBool32") boolean value) { VkPipelineDepthStencilStateCreateInfo.nstencilTestEnable(address(), value ? 1 : 0); return this; }
        /** Copies the specified {@link VkStencilOpState} to the {@code front} field. */
        public VkPipelineDepthStencilStateCreateInfo.Buffer front(VkStencilOpState value) { VkPipelineDepthStencilStateCreateInfo.nfront(address(), value); return this; }
        /** Passes the {@code front} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkPipelineDepthStencilStateCreateInfo.Buffer front(java.util.function.Consumer<VkStencilOpState> consumer) { consumer.accept(front()); return this; }
        /** Copies the specified {@link VkStencilOpState} to the {@code back} field. */
        public VkPipelineDepthStencilStateCreateInfo.Buffer back(VkStencilOpState value) { VkPipelineDepthStencilStateCreateInfo.nback(address(), value); return this; }
        /** Passes the {@code back} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkPipelineDepthStencilStateCreateInfo.Buffer back(java.util.function.Consumer<VkStencilOpState> consumer) { consumer.accept(back()); return this; }
        /** Sets the specified value to the {@code minDepthBounds} field. */
        public VkPipelineDepthStencilStateCreateInfo.Buffer minDepthBounds(float value) { VkPipelineDepthStencilStateCreateInfo.nminDepthBounds(address(), value); return this; }
        /** Sets the specified value to the {@code maxDepthBounds} field. */
        public VkPipelineDepthStencilStateCreateInfo.Buffer maxDepthBounds(float value) { VkPipelineDepthStencilStateCreateInfo.nmaxDepthBounds(address(), value); return this; }

    }

}