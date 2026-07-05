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
 * struct VkPhysicalDeviceShaderOCPMicroscalingTypesFeaturesEXT {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 shaderFloat4;
 *     VkBool32 shaderFloat6;
 *     VkBool32 shaderFloat8UnsignedE8M0;
 *     VkBool32 shaderMXInt8;
 * }}</pre>
 */
public class VkPhysicalDeviceShaderOCPMicroscalingTypesFeaturesEXT extends Struct<VkPhysicalDeviceShaderOCPMicroscalingTypesFeaturesEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SHADERFLOAT4,
        SHADERFLOAT6,
        SHADERFLOAT8UNSIGNEDE8M0,
        SHADERMXINT8;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SHADERFLOAT4 = layout.offsetof(2);
        SHADERFLOAT6 = layout.offsetof(3);
        SHADERFLOAT8UNSIGNEDE8M0 = layout.offsetof(4);
        SHADERMXINT8 = layout.offsetof(5);
    }

    protected VkPhysicalDeviceShaderOCPMicroscalingTypesFeaturesEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceShaderOCPMicroscalingTypesFeaturesEXT create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceShaderOCPMicroscalingTypesFeaturesEXT(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceShaderOCPMicroscalingTypesFeaturesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceShaderOCPMicroscalingTypesFeaturesEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** @return the value of the {@code pNext} field. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** @return the value of the {@code shaderFloat4} field. */
    @NativeType("VkBool32")
    public boolean shaderFloat4() { return nshaderFloat4(address()) != 0; }
    /** @return the value of the {@code shaderFloat6} field. */
    @NativeType("VkBool32")
    public boolean shaderFloat6() { return nshaderFloat6(address()) != 0; }
    /** @return the value of the {@code shaderFloat8UnsignedE8M0} field. */
    @NativeType("VkBool32")
    public boolean shaderFloat8UnsignedE8M0() { return nshaderFloat8UnsignedE8M0(address()) != 0; }
    /** @return the value of the {@code shaderMXInt8} field. */
    @NativeType("VkBool32")
    public boolean shaderMXInt8() { return nshaderMXInt8(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceShaderOCPMicroscalingTypesFeaturesEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTShaderOcpMicroscalingTypes#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_OCP_MICROSCALING_TYPES_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_OCP_MICROSCALING_TYPES_FEATURES_EXT} value to the {@code sType} field. */
    public VkPhysicalDeviceShaderOCPMicroscalingTypesFeaturesEXT sType$Default() { return sType(EXTShaderOcpMicroscalingTypes.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_OCP_MICROSCALING_TYPES_FEATURES_EXT); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceShaderOCPMicroscalingTypesFeaturesEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code shaderFloat4} field. */
    public VkPhysicalDeviceShaderOCPMicroscalingTypesFeaturesEXT shaderFloat4(@NativeType("VkBool32") boolean value) { nshaderFloat4(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code shaderFloat6} field. */
    public VkPhysicalDeviceShaderOCPMicroscalingTypesFeaturesEXT shaderFloat6(@NativeType("VkBool32") boolean value) { nshaderFloat6(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code shaderFloat8UnsignedE8M0} field. */
    public VkPhysicalDeviceShaderOCPMicroscalingTypesFeaturesEXT shaderFloat8UnsignedE8M0(@NativeType("VkBool32") boolean value) { nshaderFloat8UnsignedE8M0(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code shaderMXInt8} field. */
    public VkPhysicalDeviceShaderOCPMicroscalingTypesFeaturesEXT shaderMXInt8(@NativeType("VkBool32") boolean value) { nshaderMXInt8(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceShaderOCPMicroscalingTypesFeaturesEXT set(
        int sType,
        long pNext,
        boolean shaderFloat4,
        boolean shaderFloat6,
        boolean shaderFloat8UnsignedE8M0,
        boolean shaderMXInt8
    ) {
        sType(sType);
        pNext(pNext);
        shaderFloat4(shaderFloat4);
        shaderFloat6(shaderFloat6);
        shaderFloat8UnsignedE8M0(shaderFloat8UnsignedE8M0);
        shaderMXInt8(shaderMXInt8);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceShaderOCPMicroscalingTypesFeaturesEXT set(VkPhysicalDeviceShaderOCPMicroscalingTypesFeaturesEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceShaderOCPMicroscalingTypesFeaturesEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceShaderOCPMicroscalingTypesFeaturesEXT malloc() {
        return new VkPhysicalDeviceShaderOCPMicroscalingTypesFeaturesEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceShaderOCPMicroscalingTypesFeaturesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceShaderOCPMicroscalingTypesFeaturesEXT calloc() {
        return new VkPhysicalDeviceShaderOCPMicroscalingTypesFeaturesEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceShaderOCPMicroscalingTypesFeaturesEXT} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceShaderOCPMicroscalingTypesFeaturesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceShaderOCPMicroscalingTypesFeaturesEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceShaderOCPMicroscalingTypesFeaturesEXT} instance for the specified memory address. */
    public static VkPhysicalDeviceShaderOCPMicroscalingTypesFeaturesEXT create(long address) {
        return new VkPhysicalDeviceShaderOCPMicroscalingTypesFeaturesEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceShaderOCPMicroscalingTypesFeaturesEXT createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceShaderOCPMicroscalingTypesFeaturesEXT(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderOCPMicroscalingTypesFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderOCPMicroscalingTypesFeaturesEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderOCPMicroscalingTypesFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderOCPMicroscalingTypesFeaturesEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderOCPMicroscalingTypesFeaturesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderOCPMicroscalingTypesFeaturesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceShaderOCPMicroscalingTypesFeaturesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderOCPMicroscalingTypesFeaturesEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceShaderOCPMicroscalingTypesFeaturesEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceShaderOCPMicroscalingTypesFeaturesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceShaderOCPMicroscalingTypesFeaturesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDeviceShaderOCPMicroscalingTypesFeaturesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceShaderOCPMicroscalingTypesFeaturesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceShaderOCPMicroscalingTypesFeaturesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDeviceShaderOCPMicroscalingTypesFeaturesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderOCPMicroscalingTypesFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderOCPMicroscalingTypesFeaturesEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderOCPMicroscalingTypesFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderOCPMicroscalingTypesFeaturesEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceShaderOCPMicroscalingTypesFeaturesEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceShaderOCPMicroscalingTypesFeaturesEXT.PNEXT); }
    /** Unsafe version of {@link #shaderFloat4}. */
    public static int nshaderFloat4(long struct) { return memGetInt(struct + VkPhysicalDeviceShaderOCPMicroscalingTypesFeaturesEXT.SHADERFLOAT4); }
    /** Unsafe version of {@link #shaderFloat6}. */
    public static int nshaderFloat6(long struct) { return memGetInt(struct + VkPhysicalDeviceShaderOCPMicroscalingTypesFeaturesEXT.SHADERFLOAT6); }
    /** Unsafe version of {@link #shaderFloat8UnsignedE8M0}. */
    public static int nshaderFloat8UnsignedE8M0(long struct) { return memGetInt(struct + VkPhysicalDeviceShaderOCPMicroscalingTypesFeaturesEXT.SHADERFLOAT8UNSIGNEDE8M0); }
    /** Unsafe version of {@link #shaderMXInt8}. */
    public static int nshaderMXInt8(long struct) { return memGetInt(struct + VkPhysicalDeviceShaderOCPMicroscalingTypesFeaturesEXT.SHADERMXINT8); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceShaderOCPMicroscalingTypesFeaturesEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceShaderOCPMicroscalingTypesFeaturesEXT.PNEXT, value); }
    /** Unsafe version of {@link #shaderFloat4(boolean) shaderFloat4}. */
    public static void nshaderFloat4(long struct, int value) { memPutInt(struct + VkPhysicalDeviceShaderOCPMicroscalingTypesFeaturesEXT.SHADERFLOAT4, value); }
    /** Unsafe version of {@link #shaderFloat6(boolean) shaderFloat6}. */
    public static void nshaderFloat6(long struct, int value) { memPutInt(struct + VkPhysicalDeviceShaderOCPMicroscalingTypesFeaturesEXT.SHADERFLOAT6, value); }
    /** Unsafe version of {@link #shaderFloat8UnsignedE8M0(boolean) shaderFloat8UnsignedE8M0}. */
    public static void nshaderFloat8UnsignedE8M0(long struct, int value) { memPutInt(struct + VkPhysicalDeviceShaderOCPMicroscalingTypesFeaturesEXT.SHADERFLOAT8UNSIGNEDE8M0, value); }
    /** Unsafe version of {@link #shaderMXInt8(boolean) shaderMXInt8}. */
    public static void nshaderMXInt8(long struct, int value) { memPutInt(struct + VkPhysicalDeviceShaderOCPMicroscalingTypesFeaturesEXT.SHADERMXINT8, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceShaderOCPMicroscalingTypesFeaturesEXT} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceShaderOCPMicroscalingTypesFeaturesEXT, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceShaderOCPMicroscalingTypesFeaturesEXT ELEMENT_FACTORY = VkPhysicalDeviceShaderOCPMicroscalingTypesFeaturesEXT.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceShaderOCPMicroscalingTypesFeaturesEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceShaderOCPMicroscalingTypesFeaturesEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceShaderOCPMicroscalingTypesFeaturesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceShaderOCPMicroscalingTypesFeaturesEXT.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceShaderOCPMicroscalingTypesFeaturesEXT.npNext(address()); }
        /** @return the value of the {@code shaderFloat4} field. */
        @NativeType("VkBool32")
        public boolean shaderFloat4() { return VkPhysicalDeviceShaderOCPMicroscalingTypesFeaturesEXT.nshaderFloat4(address()) != 0; }
        /** @return the value of the {@code shaderFloat6} field. */
        @NativeType("VkBool32")
        public boolean shaderFloat6() { return VkPhysicalDeviceShaderOCPMicroscalingTypesFeaturesEXT.nshaderFloat6(address()) != 0; }
        /** @return the value of the {@code shaderFloat8UnsignedE8M0} field. */
        @NativeType("VkBool32")
        public boolean shaderFloat8UnsignedE8M0() { return VkPhysicalDeviceShaderOCPMicroscalingTypesFeaturesEXT.nshaderFloat8UnsignedE8M0(address()) != 0; }
        /** @return the value of the {@code shaderMXInt8} field. */
        @NativeType("VkBool32")
        public boolean shaderMXInt8() { return VkPhysicalDeviceShaderOCPMicroscalingTypesFeaturesEXT.nshaderMXInt8(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceShaderOCPMicroscalingTypesFeaturesEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceShaderOCPMicroscalingTypesFeaturesEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTShaderOcpMicroscalingTypes#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_OCP_MICROSCALING_TYPES_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_OCP_MICROSCALING_TYPES_FEATURES_EXT} value to the {@code sType} field. */
        public VkPhysicalDeviceShaderOCPMicroscalingTypesFeaturesEXT.Buffer sType$Default() { return sType(EXTShaderOcpMicroscalingTypes.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_OCP_MICROSCALING_TYPES_FEATURES_EXT); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceShaderOCPMicroscalingTypesFeaturesEXT.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceShaderOCPMicroscalingTypesFeaturesEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code shaderFloat4} field. */
        public VkPhysicalDeviceShaderOCPMicroscalingTypesFeaturesEXT.Buffer shaderFloat4(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceShaderOCPMicroscalingTypesFeaturesEXT.nshaderFloat4(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code shaderFloat6} field. */
        public VkPhysicalDeviceShaderOCPMicroscalingTypesFeaturesEXT.Buffer shaderFloat6(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceShaderOCPMicroscalingTypesFeaturesEXT.nshaderFloat6(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code shaderFloat8UnsignedE8M0} field. */
        public VkPhysicalDeviceShaderOCPMicroscalingTypesFeaturesEXT.Buffer shaderFloat8UnsignedE8M0(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceShaderOCPMicroscalingTypesFeaturesEXT.nshaderFloat8UnsignedE8M0(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code shaderMXInt8} field. */
        public VkPhysicalDeviceShaderOCPMicroscalingTypesFeaturesEXT.Buffer shaderMXInt8(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceShaderOCPMicroscalingTypesFeaturesEXT.nshaderMXInt8(address(), value ? 1 : 0); return this; }

    }

}