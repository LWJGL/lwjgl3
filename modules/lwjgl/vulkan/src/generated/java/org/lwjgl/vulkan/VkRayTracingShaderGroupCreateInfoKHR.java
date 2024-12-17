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
 * <pre>{@code
 * struct VkRayTracingShaderGroupCreateInfoKHR {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkRayTracingShaderGroupTypeKHR type;
 *     uint32_t generalShader;
 *     uint32_t closestHitShader;
 *     uint32_t anyHitShader;
 *     uint32_t intersectionShader;
 *     void const * pShaderGroupCaptureReplayHandle;
 * }}</pre>
 */
public class VkRayTracingShaderGroupCreateInfoKHR extends Struct<VkRayTracingShaderGroupCreateInfoKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        TYPE,
        GENERALSHADER,
        CLOSESTHITSHADER,
        ANYHITSHADER,
        INTERSECTIONSHADER,
        PSHADERGROUPCAPTUREREPLAYHANDLE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        TYPE = layout.offsetof(2);
        GENERALSHADER = layout.offsetof(3);
        CLOSESTHITSHADER = layout.offsetof(4);
        ANYHITSHADER = layout.offsetof(5);
        INTERSECTIONSHADER = layout.offsetof(6);
        PSHADERGROUPCAPTUREREPLAYHANDLE = layout.offsetof(7);
    }

    protected VkRayTracingShaderGroupCreateInfoKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkRayTracingShaderGroupCreateInfoKHR create(long address, @Nullable ByteBuffer container) {
        return new VkRayTracingShaderGroupCreateInfoKHR(address, container);
    }

    /**
     * Creates a {@code VkRayTracingShaderGroupCreateInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkRayTracingShaderGroupCreateInfoKHR(ByteBuffer container) {
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
    /** @return the value of the {@code type} field. */
    @NativeType("VkRayTracingShaderGroupTypeKHR")
    public int type() { return ntype(address()); }
    /** @return the value of the {@code generalShader} field. */
    @NativeType("uint32_t")
    public int generalShader() { return ngeneralShader(address()); }
    /** @return the value of the {@code closestHitShader} field. */
    @NativeType("uint32_t")
    public int closestHitShader() { return nclosestHitShader(address()); }
    /** @return the value of the {@code anyHitShader} field. */
    @NativeType("uint32_t")
    public int anyHitShader() { return nanyHitShader(address()); }
    /** @return the value of the {@code intersectionShader} field. */
    @NativeType("uint32_t")
    public int intersectionShader() { return nintersectionShader(address()); }
    /** @return the value of the {@code pShaderGroupCaptureReplayHandle} field. */
    @NativeType("void const *")
    public long pShaderGroupCaptureReplayHandle() { return npShaderGroupCaptureReplayHandle(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkRayTracingShaderGroupCreateInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRRayTracingPipeline#VK_STRUCTURE_TYPE_RAY_TRACING_SHADER_GROUP_CREATE_INFO_KHR STRUCTURE_TYPE_RAY_TRACING_SHADER_GROUP_CREATE_INFO_KHR} value to the {@code sType} field. */
    public VkRayTracingShaderGroupCreateInfoKHR sType$Default() { return sType(KHRRayTracingPipeline.VK_STRUCTURE_TYPE_RAY_TRACING_SHADER_GROUP_CREATE_INFO_KHR); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkRayTracingShaderGroupCreateInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code type} field. */
    public VkRayTracingShaderGroupCreateInfoKHR type(@NativeType("VkRayTracingShaderGroupTypeKHR") int value) { ntype(address(), value); return this; }
    /** Sets the specified value to the {@code generalShader} field. */
    public VkRayTracingShaderGroupCreateInfoKHR generalShader(@NativeType("uint32_t") int value) { ngeneralShader(address(), value); return this; }
    /** Sets the specified value to the {@code closestHitShader} field. */
    public VkRayTracingShaderGroupCreateInfoKHR closestHitShader(@NativeType("uint32_t") int value) { nclosestHitShader(address(), value); return this; }
    /** Sets the specified value to the {@code anyHitShader} field. */
    public VkRayTracingShaderGroupCreateInfoKHR anyHitShader(@NativeType("uint32_t") int value) { nanyHitShader(address(), value); return this; }
    /** Sets the specified value to the {@code intersectionShader} field. */
    public VkRayTracingShaderGroupCreateInfoKHR intersectionShader(@NativeType("uint32_t") int value) { nintersectionShader(address(), value); return this; }
    /** Sets the specified value to the {@code pShaderGroupCaptureReplayHandle} field. */
    public VkRayTracingShaderGroupCreateInfoKHR pShaderGroupCaptureReplayHandle(@NativeType("void const *") long value) { npShaderGroupCaptureReplayHandle(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkRayTracingShaderGroupCreateInfoKHR set(
        int sType,
        long pNext,
        int type,
        int generalShader,
        int closestHitShader,
        int anyHitShader,
        int intersectionShader,
        long pShaderGroupCaptureReplayHandle
    ) {
        sType(sType);
        pNext(pNext);
        type(type);
        generalShader(generalShader);
        closestHitShader(closestHitShader);
        anyHitShader(anyHitShader);
        intersectionShader(intersectionShader);
        pShaderGroupCaptureReplayHandle(pShaderGroupCaptureReplayHandle);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkRayTracingShaderGroupCreateInfoKHR set(VkRayTracingShaderGroupCreateInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkRayTracingShaderGroupCreateInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkRayTracingShaderGroupCreateInfoKHR malloc() {
        return new VkRayTracingShaderGroupCreateInfoKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkRayTracingShaderGroupCreateInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkRayTracingShaderGroupCreateInfoKHR calloc() {
        return new VkRayTracingShaderGroupCreateInfoKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkRayTracingShaderGroupCreateInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkRayTracingShaderGroupCreateInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkRayTracingShaderGroupCreateInfoKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkRayTracingShaderGroupCreateInfoKHR} instance for the specified memory address. */
    public static VkRayTracingShaderGroupCreateInfoKHR create(long address) {
        return new VkRayTracingShaderGroupCreateInfoKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkRayTracingShaderGroupCreateInfoKHR createSafe(long address) {
        return address == NULL ? null : new VkRayTracingShaderGroupCreateInfoKHR(address, null);
    }

    /**
     * Returns a new {@link VkRayTracingShaderGroupCreateInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkRayTracingShaderGroupCreateInfoKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkRayTracingShaderGroupCreateInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkRayTracingShaderGroupCreateInfoKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkRayTracingShaderGroupCreateInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkRayTracingShaderGroupCreateInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkRayTracingShaderGroupCreateInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkRayTracingShaderGroupCreateInfoKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkRayTracingShaderGroupCreateInfoKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkRayTracingShaderGroupCreateInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkRayTracingShaderGroupCreateInfoKHR malloc(MemoryStack stack) {
        return new VkRayTracingShaderGroupCreateInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkRayTracingShaderGroupCreateInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkRayTracingShaderGroupCreateInfoKHR calloc(MemoryStack stack) {
        return new VkRayTracingShaderGroupCreateInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkRayTracingShaderGroupCreateInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkRayTracingShaderGroupCreateInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkRayTracingShaderGroupCreateInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkRayTracingShaderGroupCreateInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkRayTracingShaderGroupCreateInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkRayTracingShaderGroupCreateInfoKHR.PNEXT); }
    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + VkRayTracingShaderGroupCreateInfoKHR.TYPE); }
    /** Unsafe version of {@link #generalShader}. */
    public static int ngeneralShader(long struct) { return memGetInt(struct + VkRayTracingShaderGroupCreateInfoKHR.GENERALSHADER); }
    /** Unsafe version of {@link #closestHitShader}. */
    public static int nclosestHitShader(long struct) { return memGetInt(struct + VkRayTracingShaderGroupCreateInfoKHR.CLOSESTHITSHADER); }
    /** Unsafe version of {@link #anyHitShader}. */
    public static int nanyHitShader(long struct) { return memGetInt(struct + VkRayTracingShaderGroupCreateInfoKHR.ANYHITSHADER); }
    /** Unsafe version of {@link #intersectionShader}. */
    public static int nintersectionShader(long struct) { return memGetInt(struct + VkRayTracingShaderGroupCreateInfoKHR.INTERSECTIONSHADER); }
    /** Unsafe version of {@link #pShaderGroupCaptureReplayHandle}. */
    public static long npShaderGroupCaptureReplayHandle(long struct) { return memGetAddress(struct + VkRayTracingShaderGroupCreateInfoKHR.PSHADERGROUPCAPTUREREPLAYHANDLE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkRayTracingShaderGroupCreateInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkRayTracingShaderGroupCreateInfoKHR.PNEXT, value); }
    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + VkRayTracingShaderGroupCreateInfoKHR.TYPE, value); }
    /** Unsafe version of {@link #generalShader(int) generalShader}. */
    public static void ngeneralShader(long struct, int value) { memPutInt(struct + VkRayTracingShaderGroupCreateInfoKHR.GENERALSHADER, value); }
    /** Unsafe version of {@link #closestHitShader(int) closestHitShader}. */
    public static void nclosestHitShader(long struct, int value) { memPutInt(struct + VkRayTracingShaderGroupCreateInfoKHR.CLOSESTHITSHADER, value); }
    /** Unsafe version of {@link #anyHitShader(int) anyHitShader}. */
    public static void nanyHitShader(long struct, int value) { memPutInt(struct + VkRayTracingShaderGroupCreateInfoKHR.ANYHITSHADER, value); }
    /** Unsafe version of {@link #intersectionShader(int) intersectionShader}. */
    public static void nintersectionShader(long struct, int value) { memPutInt(struct + VkRayTracingShaderGroupCreateInfoKHR.INTERSECTIONSHADER, value); }
    /** Unsafe version of {@link #pShaderGroupCaptureReplayHandle(long) pShaderGroupCaptureReplayHandle}. */
    public static void npShaderGroupCaptureReplayHandle(long struct, long value) { memPutAddress(struct + VkRayTracingShaderGroupCreateInfoKHR.PSHADERGROUPCAPTUREREPLAYHANDLE, value); }

    // -----------------------------------

    /** An array of {@link VkRayTracingShaderGroupCreateInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkRayTracingShaderGroupCreateInfoKHR, Buffer> implements NativeResource {

        private static final VkRayTracingShaderGroupCreateInfoKHR ELEMENT_FACTORY = VkRayTracingShaderGroupCreateInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkRayTracingShaderGroupCreateInfoKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkRayTracingShaderGroupCreateInfoKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkRayTracingShaderGroupCreateInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkRayTracingShaderGroupCreateInfoKHR.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkRayTracingShaderGroupCreateInfoKHR.npNext(address()); }
        /** @return the value of the {@code type} field. */
        @NativeType("VkRayTracingShaderGroupTypeKHR")
        public int type() { return VkRayTracingShaderGroupCreateInfoKHR.ntype(address()); }
        /** @return the value of the {@code generalShader} field. */
        @NativeType("uint32_t")
        public int generalShader() { return VkRayTracingShaderGroupCreateInfoKHR.ngeneralShader(address()); }
        /** @return the value of the {@code closestHitShader} field. */
        @NativeType("uint32_t")
        public int closestHitShader() { return VkRayTracingShaderGroupCreateInfoKHR.nclosestHitShader(address()); }
        /** @return the value of the {@code anyHitShader} field. */
        @NativeType("uint32_t")
        public int anyHitShader() { return VkRayTracingShaderGroupCreateInfoKHR.nanyHitShader(address()); }
        /** @return the value of the {@code intersectionShader} field. */
        @NativeType("uint32_t")
        public int intersectionShader() { return VkRayTracingShaderGroupCreateInfoKHR.nintersectionShader(address()); }
        /** @return the value of the {@code pShaderGroupCaptureReplayHandle} field. */
        @NativeType("void const *")
        public long pShaderGroupCaptureReplayHandle() { return VkRayTracingShaderGroupCreateInfoKHR.npShaderGroupCaptureReplayHandle(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkRayTracingShaderGroupCreateInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkRayTracingShaderGroupCreateInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRRayTracingPipeline#VK_STRUCTURE_TYPE_RAY_TRACING_SHADER_GROUP_CREATE_INFO_KHR STRUCTURE_TYPE_RAY_TRACING_SHADER_GROUP_CREATE_INFO_KHR} value to the {@code sType} field. */
        public VkRayTracingShaderGroupCreateInfoKHR.Buffer sType$Default() { return sType(KHRRayTracingPipeline.VK_STRUCTURE_TYPE_RAY_TRACING_SHADER_GROUP_CREATE_INFO_KHR); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkRayTracingShaderGroupCreateInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkRayTracingShaderGroupCreateInfoKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code type} field. */
        public VkRayTracingShaderGroupCreateInfoKHR.Buffer type(@NativeType("VkRayTracingShaderGroupTypeKHR") int value) { VkRayTracingShaderGroupCreateInfoKHR.ntype(address(), value); return this; }
        /** Sets the specified value to the {@code generalShader} field. */
        public VkRayTracingShaderGroupCreateInfoKHR.Buffer generalShader(@NativeType("uint32_t") int value) { VkRayTracingShaderGroupCreateInfoKHR.ngeneralShader(address(), value); return this; }
        /** Sets the specified value to the {@code closestHitShader} field. */
        public VkRayTracingShaderGroupCreateInfoKHR.Buffer closestHitShader(@NativeType("uint32_t") int value) { VkRayTracingShaderGroupCreateInfoKHR.nclosestHitShader(address(), value); return this; }
        /** Sets the specified value to the {@code anyHitShader} field. */
        public VkRayTracingShaderGroupCreateInfoKHR.Buffer anyHitShader(@NativeType("uint32_t") int value) { VkRayTracingShaderGroupCreateInfoKHR.nanyHitShader(address(), value); return this; }
        /** Sets the specified value to the {@code intersectionShader} field. */
        public VkRayTracingShaderGroupCreateInfoKHR.Buffer intersectionShader(@NativeType("uint32_t") int value) { VkRayTracingShaderGroupCreateInfoKHR.nintersectionShader(address(), value); return this; }
        /** Sets the specified value to the {@code pShaderGroupCaptureReplayHandle} field. */
        public VkRayTracingShaderGroupCreateInfoKHR.Buffer pShaderGroupCaptureReplayHandle(@NativeType("void const *") long value) { VkRayTracingShaderGroupCreateInfoKHR.npShaderGroupCaptureReplayHandle(address(), value); return this; }

    }

}