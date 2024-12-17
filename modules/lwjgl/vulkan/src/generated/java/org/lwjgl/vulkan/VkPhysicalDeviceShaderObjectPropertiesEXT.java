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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

import static org.lwjgl.vulkan.VK10.*;

/**
 * <pre>{@code
 * struct VkPhysicalDeviceShaderObjectPropertiesEXT {
 *     VkStructureType sType;
 *     void * pNext;
 *     uint8_t shaderBinaryUUID[VK_UUID_SIZE];
 *     uint32_t shaderBinaryVersion;
 * }}</pre>
 */
public class VkPhysicalDeviceShaderObjectPropertiesEXT extends Struct<VkPhysicalDeviceShaderObjectPropertiesEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SHADERBINARYUUID,
        SHADERBINARYVERSION;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __array(1, VK_UUID_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SHADERBINARYUUID = layout.offsetof(2);
        SHADERBINARYVERSION = layout.offsetof(3);
    }

    protected VkPhysicalDeviceShaderObjectPropertiesEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceShaderObjectPropertiesEXT create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceShaderObjectPropertiesEXT(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceShaderObjectPropertiesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceShaderObjectPropertiesEXT(ByteBuffer container) {
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
    /** @return a {@link ByteBuffer} view of the {@code shaderBinaryUUID} field. */
    @NativeType("uint8_t[VK_UUID_SIZE]")
    public ByteBuffer shaderBinaryUUID() { return nshaderBinaryUUID(address()); }
    /** @return the value at the specified index of the {@code shaderBinaryUUID} field. */
    @NativeType("uint8_t")
    public byte shaderBinaryUUID(int index) { return nshaderBinaryUUID(address(), index); }
    /** @return the value of the {@code shaderBinaryVersion} field. */
    @NativeType("uint32_t")
    public int shaderBinaryVersion() { return nshaderBinaryVersion(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceShaderObjectPropertiesEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTShaderObject#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_OBJECT_PROPERTIES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_OBJECT_PROPERTIES_EXT} value to the {@code sType} field. */
    public VkPhysicalDeviceShaderObjectPropertiesEXT sType$Default() { return sType(EXTShaderObject.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_OBJECT_PROPERTIES_EXT); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceShaderObjectPropertiesEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceShaderObjectPropertiesEXT set(
        int sType,
        long pNext
    ) {
        sType(sType);
        pNext(pNext);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceShaderObjectPropertiesEXT set(VkPhysicalDeviceShaderObjectPropertiesEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceShaderObjectPropertiesEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceShaderObjectPropertiesEXT malloc() {
        return new VkPhysicalDeviceShaderObjectPropertiesEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceShaderObjectPropertiesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceShaderObjectPropertiesEXT calloc() {
        return new VkPhysicalDeviceShaderObjectPropertiesEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceShaderObjectPropertiesEXT} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceShaderObjectPropertiesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceShaderObjectPropertiesEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceShaderObjectPropertiesEXT} instance for the specified memory address. */
    public static VkPhysicalDeviceShaderObjectPropertiesEXT create(long address) {
        return new VkPhysicalDeviceShaderObjectPropertiesEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceShaderObjectPropertiesEXT createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceShaderObjectPropertiesEXT(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderObjectPropertiesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderObjectPropertiesEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderObjectPropertiesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderObjectPropertiesEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderObjectPropertiesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderObjectPropertiesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceShaderObjectPropertiesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderObjectPropertiesEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceShaderObjectPropertiesEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceShaderObjectPropertiesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceShaderObjectPropertiesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDeviceShaderObjectPropertiesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceShaderObjectPropertiesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceShaderObjectPropertiesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDeviceShaderObjectPropertiesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderObjectPropertiesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderObjectPropertiesEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderObjectPropertiesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderObjectPropertiesEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceShaderObjectPropertiesEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceShaderObjectPropertiesEXT.PNEXT); }
    /** Unsafe version of {@link #shaderBinaryUUID}. */
    public static ByteBuffer nshaderBinaryUUID(long struct) { return memByteBuffer(struct + VkPhysicalDeviceShaderObjectPropertiesEXT.SHADERBINARYUUID, VK_UUID_SIZE); }
    /** Unsafe version of {@link #shaderBinaryUUID(int) shaderBinaryUUID}. */
    public static byte nshaderBinaryUUID(long struct, int index) {
        return memGetByte(struct + VkPhysicalDeviceShaderObjectPropertiesEXT.SHADERBINARYUUID + check(index, VK_UUID_SIZE) * 1);
    }
    /** Unsafe version of {@link #shaderBinaryVersion}. */
    public static int nshaderBinaryVersion(long struct) { return memGetInt(struct + VkPhysicalDeviceShaderObjectPropertiesEXT.SHADERBINARYVERSION); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceShaderObjectPropertiesEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceShaderObjectPropertiesEXT.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceShaderObjectPropertiesEXT} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceShaderObjectPropertiesEXT, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceShaderObjectPropertiesEXT ELEMENT_FACTORY = VkPhysicalDeviceShaderObjectPropertiesEXT.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceShaderObjectPropertiesEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceShaderObjectPropertiesEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceShaderObjectPropertiesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceShaderObjectPropertiesEXT.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceShaderObjectPropertiesEXT.npNext(address()); }
        /** @return a {@link ByteBuffer} view of the {@code shaderBinaryUUID} field. */
        @NativeType("uint8_t[VK_UUID_SIZE]")
        public ByteBuffer shaderBinaryUUID() { return VkPhysicalDeviceShaderObjectPropertiesEXT.nshaderBinaryUUID(address()); }
        /** @return the value at the specified index of the {@code shaderBinaryUUID} field. */
        @NativeType("uint8_t")
        public byte shaderBinaryUUID(int index) { return VkPhysicalDeviceShaderObjectPropertiesEXT.nshaderBinaryUUID(address(), index); }
        /** @return the value of the {@code shaderBinaryVersion} field. */
        @NativeType("uint32_t")
        public int shaderBinaryVersion() { return VkPhysicalDeviceShaderObjectPropertiesEXT.nshaderBinaryVersion(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceShaderObjectPropertiesEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceShaderObjectPropertiesEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTShaderObject#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_OBJECT_PROPERTIES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_OBJECT_PROPERTIES_EXT} value to the {@code sType} field. */
        public VkPhysicalDeviceShaderObjectPropertiesEXT.Buffer sType$Default() { return sType(EXTShaderObject.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_OBJECT_PROPERTIES_EXT); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceShaderObjectPropertiesEXT.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceShaderObjectPropertiesEXT.npNext(address(), value); return this; }

    }

}