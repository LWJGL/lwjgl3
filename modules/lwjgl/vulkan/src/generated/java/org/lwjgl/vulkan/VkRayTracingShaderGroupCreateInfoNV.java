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
 * struct VkRayTracingShaderGroupCreateInfoNV {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkRayTracingShaderGroupTypeKHR type;
 *     uint32_t generalShader;
 *     uint32_t closestHitShader;
 *     uint32_t anyHitShader;
 *     uint32_t intersectionShader;
 * }}</pre>
 */
public class VkRayTracingShaderGroupCreateInfoNV extends Struct<VkRayTracingShaderGroupCreateInfoNV> implements NativeResource {

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
        INTERSECTIONSHADER;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4)
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
    }

    protected VkRayTracingShaderGroupCreateInfoNV(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkRayTracingShaderGroupCreateInfoNV create(long address, @Nullable ByteBuffer container) {
        return new VkRayTracingShaderGroupCreateInfoNV(address, container);
    }

    /**
     * Creates a {@code VkRayTracingShaderGroupCreateInfoNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkRayTracingShaderGroupCreateInfoNV(ByteBuffer container) {
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

    /** Sets the specified value to the {@code sType} field. */
    public VkRayTracingShaderGroupCreateInfoNV sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link NVRayTracing#VK_STRUCTURE_TYPE_RAY_TRACING_SHADER_GROUP_CREATE_INFO_NV STRUCTURE_TYPE_RAY_TRACING_SHADER_GROUP_CREATE_INFO_NV} value to the {@code sType} field. */
    public VkRayTracingShaderGroupCreateInfoNV sType$Default() { return sType(NVRayTracing.VK_STRUCTURE_TYPE_RAY_TRACING_SHADER_GROUP_CREATE_INFO_NV); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkRayTracingShaderGroupCreateInfoNV pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code type} field. */
    public VkRayTracingShaderGroupCreateInfoNV type(@NativeType("VkRayTracingShaderGroupTypeKHR") int value) { ntype(address(), value); return this; }
    /** Sets the specified value to the {@code generalShader} field. */
    public VkRayTracingShaderGroupCreateInfoNV generalShader(@NativeType("uint32_t") int value) { ngeneralShader(address(), value); return this; }
    /** Sets the specified value to the {@code closestHitShader} field. */
    public VkRayTracingShaderGroupCreateInfoNV closestHitShader(@NativeType("uint32_t") int value) { nclosestHitShader(address(), value); return this; }
    /** Sets the specified value to the {@code anyHitShader} field. */
    public VkRayTracingShaderGroupCreateInfoNV anyHitShader(@NativeType("uint32_t") int value) { nanyHitShader(address(), value); return this; }
    /** Sets the specified value to the {@code intersectionShader} field. */
    public VkRayTracingShaderGroupCreateInfoNV intersectionShader(@NativeType("uint32_t") int value) { nintersectionShader(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkRayTracingShaderGroupCreateInfoNV set(
        int sType,
        long pNext,
        int type,
        int generalShader,
        int closestHitShader,
        int anyHitShader,
        int intersectionShader
    ) {
        sType(sType);
        pNext(pNext);
        type(type);
        generalShader(generalShader);
        closestHitShader(closestHitShader);
        anyHitShader(anyHitShader);
        intersectionShader(intersectionShader);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkRayTracingShaderGroupCreateInfoNV set(VkRayTracingShaderGroupCreateInfoNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkRayTracingShaderGroupCreateInfoNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkRayTracingShaderGroupCreateInfoNV malloc() {
        return new VkRayTracingShaderGroupCreateInfoNV(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkRayTracingShaderGroupCreateInfoNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkRayTracingShaderGroupCreateInfoNV calloc() {
        return new VkRayTracingShaderGroupCreateInfoNV(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkRayTracingShaderGroupCreateInfoNV} instance allocated with {@link BufferUtils}. */
    public static VkRayTracingShaderGroupCreateInfoNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkRayTracingShaderGroupCreateInfoNV(memAddress(container), container);
    }

    /** Returns a new {@code VkRayTracingShaderGroupCreateInfoNV} instance for the specified memory address. */
    public static VkRayTracingShaderGroupCreateInfoNV create(long address) {
        return new VkRayTracingShaderGroupCreateInfoNV(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkRayTracingShaderGroupCreateInfoNV createSafe(long address) {
        return address == NULL ? null : new VkRayTracingShaderGroupCreateInfoNV(address, null);
    }

    /**
     * Returns a new {@link VkRayTracingShaderGroupCreateInfoNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkRayTracingShaderGroupCreateInfoNV.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkRayTracingShaderGroupCreateInfoNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkRayTracingShaderGroupCreateInfoNV.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkRayTracingShaderGroupCreateInfoNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkRayTracingShaderGroupCreateInfoNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkRayTracingShaderGroupCreateInfoNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkRayTracingShaderGroupCreateInfoNV.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkRayTracingShaderGroupCreateInfoNV.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkRayTracingShaderGroupCreateInfoNV mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkRayTracingShaderGroupCreateInfoNV callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkRayTracingShaderGroupCreateInfoNV mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkRayTracingShaderGroupCreateInfoNV callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkRayTracingShaderGroupCreateInfoNV.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkRayTracingShaderGroupCreateInfoNV.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkRayTracingShaderGroupCreateInfoNV.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkRayTracingShaderGroupCreateInfoNV.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkRayTracingShaderGroupCreateInfoNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkRayTracingShaderGroupCreateInfoNV malloc(MemoryStack stack) {
        return new VkRayTracingShaderGroupCreateInfoNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkRayTracingShaderGroupCreateInfoNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkRayTracingShaderGroupCreateInfoNV calloc(MemoryStack stack) {
        return new VkRayTracingShaderGroupCreateInfoNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkRayTracingShaderGroupCreateInfoNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkRayTracingShaderGroupCreateInfoNV.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkRayTracingShaderGroupCreateInfoNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkRayTracingShaderGroupCreateInfoNV.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkRayTracingShaderGroupCreateInfoNV.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkRayTracingShaderGroupCreateInfoNV.PNEXT); }
    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + VkRayTracingShaderGroupCreateInfoNV.TYPE); }
    /** Unsafe version of {@link #generalShader}. */
    public static int ngeneralShader(long struct) { return memGetInt(struct + VkRayTracingShaderGroupCreateInfoNV.GENERALSHADER); }
    /** Unsafe version of {@link #closestHitShader}. */
    public static int nclosestHitShader(long struct) { return memGetInt(struct + VkRayTracingShaderGroupCreateInfoNV.CLOSESTHITSHADER); }
    /** Unsafe version of {@link #anyHitShader}. */
    public static int nanyHitShader(long struct) { return memGetInt(struct + VkRayTracingShaderGroupCreateInfoNV.ANYHITSHADER); }
    /** Unsafe version of {@link #intersectionShader}. */
    public static int nintersectionShader(long struct) { return memGetInt(struct + VkRayTracingShaderGroupCreateInfoNV.INTERSECTIONSHADER); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkRayTracingShaderGroupCreateInfoNV.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkRayTracingShaderGroupCreateInfoNV.PNEXT, value); }
    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + VkRayTracingShaderGroupCreateInfoNV.TYPE, value); }
    /** Unsafe version of {@link #generalShader(int) generalShader}. */
    public static void ngeneralShader(long struct, int value) { memPutInt(struct + VkRayTracingShaderGroupCreateInfoNV.GENERALSHADER, value); }
    /** Unsafe version of {@link #closestHitShader(int) closestHitShader}. */
    public static void nclosestHitShader(long struct, int value) { memPutInt(struct + VkRayTracingShaderGroupCreateInfoNV.CLOSESTHITSHADER, value); }
    /** Unsafe version of {@link #anyHitShader(int) anyHitShader}. */
    public static void nanyHitShader(long struct, int value) { memPutInt(struct + VkRayTracingShaderGroupCreateInfoNV.ANYHITSHADER, value); }
    /** Unsafe version of {@link #intersectionShader(int) intersectionShader}. */
    public static void nintersectionShader(long struct, int value) { memPutInt(struct + VkRayTracingShaderGroupCreateInfoNV.INTERSECTIONSHADER, value); }

    // -----------------------------------

    /** An array of {@link VkRayTracingShaderGroupCreateInfoNV} structs. */
    public static class Buffer extends StructBuffer<VkRayTracingShaderGroupCreateInfoNV, Buffer> implements NativeResource {

        private static final VkRayTracingShaderGroupCreateInfoNV ELEMENT_FACTORY = VkRayTracingShaderGroupCreateInfoNV.create(-1L);

        /**
         * Creates a new {@code VkRayTracingShaderGroupCreateInfoNV.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkRayTracingShaderGroupCreateInfoNV#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkRayTracingShaderGroupCreateInfoNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkRayTracingShaderGroupCreateInfoNV.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkRayTracingShaderGroupCreateInfoNV.npNext(address()); }
        /** @return the value of the {@code type} field. */
        @NativeType("VkRayTracingShaderGroupTypeKHR")
        public int type() { return VkRayTracingShaderGroupCreateInfoNV.ntype(address()); }
        /** @return the value of the {@code generalShader} field. */
        @NativeType("uint32_t")
        public int generalShader() { return VkRayTracingShaderGroupCreateInfoNV.ngeneralShader(address()); }
        /** @return the value of the {@code closestHitShader} field. */
        @NativeType("uint32_t")
        public int closestHitShader() { return VkRayTracingShaderGroupCreateInfoNV.nclosestHitShader(address()); }
        /** @return the value of the {@code anyHitShader} field. */
        @NativeType("uint32_t")
        public int anyHitShader() { return VkRayTracingShaderGroupCreateInfoNV.nanyHitShader(address()); }
        /** @return the value of the {@code intersectionShader} field. */
        @NativeType("uint32_t")
        public int intersectionShader() { return VkRayTracingShaderGroupCreateInfoNV.nintersectionShader(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkRayTracingShaderGroupCreateInfoNV.Buffer sType(@NativeType("VkStructureType") int value) { VkRayTracingShaderGroupCreateInfoNV.nsType(address(), value); return this; }
        /** Sets the {@link NVRayTracing#VK_STRUCTURE_TYPE_RAY_TRACING_SHADER_GROUP_CREATE_INFO_NV STRUCTURE_TYPE_RAY_TRACING_SHADER_GROUP_CREATE_INFO_NV} value to the {@code sType} field. */
        public VkRayTracingShaderGroupCreateInfoNV.Buffer sType$Default() { return sType(NVRayTracing.VK_STRUCTURE_TYPE_RAY_TRACING_SHADER_GROUP_CREATE_INFO_NV); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkRayTracingShaderGroupCreateInfoNV.Buffer pNext(@NativeType("void const *") long value) { VkRayTracingShaderGroupCreateInfoNV.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code type} field. */
        public VkRayTracingShaderGroupCreateInfoNV.Buffer type(@NativeType("VkRayTracingShaderGroupTypeKHR") int value) { VkRayTracingShaderGroupCreateInfoNV.ntype(address(), value); return this; }
        /** Sets the specified value to the {@code generalShader} field. */
        public VkRayTracingShaderGroupCreateInfoNV.Buffer generalShader(@NativeType("uint32_t") int value) { VkRayTracingShaderGroupCreateInfoNV.ngeneralShader(address(), value); return this; }
        /** Sets the specified value to the {@code closestHitShader} field. */
        public VkRayTracingShaderGroupCreateInfoNV.Buffer closestHitShader(@NativeType("uint32_t") int value) { VkRayTracingShaderGroupCreateInfoNV.nclosestHitShader(address(), value); return this; }
        /** Sets the specified value to the {@code anyHitShader} field. */
        public VkRayTracingShaderGroupCreateInfoNV.Buffer anyHitShader(@NativeType("uint32_t") int value) { VkRayTracingShaderGroupCreateInfoNV.nanyHitShader(address(), value); return this; }
        /** Sets the specified value to the {@code intersectionShader} field. */
        public VkRayTracingShaderGroupCreateInfoNV.Buffer intersectionShader(@NativeType("uint32_t") int value) { VkRayTracingShaderGroupCreateInfoNV.nintersectionShader(address(), value); return this; }

    }

}