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

import static org.lwjgl.vulkan.VK10.*;

/**
 * Structure used to retrieve pipeline properties.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTPipelineProperties#VK_STRUCTURE_TYPE_PIPELINE_PROPERTIES_IDENTIFIER_EXT STRUCTURE_TYPE_PIPELINE_PROPERTIES_IDENTIFIER_EXT}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPipelinePropertiesIdentifierEXT {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     uint8_t {@link #pipelineIdentifier}[VK_UUID_SIZE];
 * }</code></pre>
 */
public class VkPipelinePropertiesIdentifierEXT extends Struct<VkPipelinePropertiesIdentifierEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        PIPELINEIDENTIFIER;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __array(1, VK_UUID_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PIPELINEIDENTIFIER = layout.offsetof(2);
    }

    protected VkPipelinePropertiesIdentifierEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPipelinePropertiesIdentifierEXT create(long address, @Nullable ByteBuffer container) {
        return new VkPipelinePropertiesIdentifierEXT(address, container);
    }

    /**
     * Creates a {@code VkPipelinePropertiesIdentifierEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPipelinePropertiesIdentifierEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** a {@code VkStructureType} value identifying this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** an array of {@link VK10#VK_UUID_SIZE UUID_SIZE} {@code uint8_t} values into which the pipeline identifier will be written. */
    @NativeType("uint8_t[VK_UUID_SIZE]")
    public ByteBuffer pipelineIdentifier() { return npipelineIdentifier(address()); }
    /** an array of {@link VK10#VK_UUID_SIZE UUID_SIZE} {@code uint8_t} values into which the pipeline identifier will be written. */
    @NativeType("uint8_t")
    public byte pipelineIdentifier(int index) { return npipelineIdentifier(address(), index); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPipelinePropertiesIdentifierEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTPipelineProperties#VK_STRUCTURE_TYPE_PIPELINE_PROPERTIES_IDENTIFIER_EXT STRUCTURE_TYPE_PIPELINE_PROPERTIES_IDENTIFIER_EXT} value to the {@link #sType} field. */
    public VkPipelinePropertiesIdentifierEXT sType$Default() { return sType(EXTPipelineProperties.VK_STRUCTURE_TYPE_PIPELINE_PROPERTIES_IDENTIFIER_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPipelinePropertiesIdentifierEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Copies the specified {@link ByteBuffer} to the {@link #pipelineIdentifier} field. */
    public VkPipelinePropertiesIdentifierEXT pipelineIdentifier(@NativeType("uint8_t[VK_UUID_SIZE]") ByteBuffer value) { npipelineIdentifier(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@link #pipelineIdentifier} field. */
    public VkPipelinePropertiesIdentifierEXT pipelineIdentifier(int index, @NativeType("uint8_t") byte value) { npipelineIdentifier(address(), index, value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPipelinePropertiesIdentifierEXT set(
        int sType,
        long pNext,
        ByteBuffer pipelineIdentifier
    ) {
        sType(sType);
        pNext(pNext);
        pipelineIdentifier(pipelineIdentifier);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPipelinePropertiesIdentifierEXT set(VkPipelinePropertiesIdentifierEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPipelinePropertiesIdentifierEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPipelinePropertiesIdentifierEXT malloc() {
        return new VkPipelinePropertiesIdentifierEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPipelinePropertiesIdentifierEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPipelinePropertiesIdentifierEXT calloc() {
        return new VkPipelinePropertiesIdentifierEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPipelinePropertiesIdentifierEXT} instance allocated with {@link BufferUtils}. */
    public static VkPipelinePropertiesIdentifierEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPipelinePropertiesIdentifierEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkPipelinePropertiesIdentifierEXT} instance for the specified memory address. */
    public static VkPipelinePropertiesIdentifierEXT create(long address) {
        return new VkPipelinePropertiesIdentifierEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPipelinePropertiesIdentifierEXT createSafe(long address) {
        return address == NULL ? null : new VkPipelinePropertiesIdentifierEXT(address, null);
    }

    /**
     * Returns a new {@link VkPipelinePropertiesIdentifierEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelinePropertiesIdentifierEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPipelinePropertiesIdentifierEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelinePropertiesIdentifierEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelinePropertiesIdentifierEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelinePropertiesIdentifierEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPipelinePropertiesIdentifierEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPipelinePropertiesIdentifierEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPipelinePropertiesIdentifierEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPipelinePropertiesIdentifierEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelinePropertiesIdentifierEXT malloc(MemoryStack stack) {
        return new VkPipelinePropertiesIdentifierEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPipelinePropertiesIdentifierEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelinePropertiesIdentifierEXT calloc(MemoryStack stack) {
        return new VkPipelinePropertiesIdentifierEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPipelinePropertiesIdentifierEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPipelinePropertiesIdentifierEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelinePropertiesIdentifierEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPipelinePropertiesIdentifierEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPipelinePropertiesIdentifierEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPipelinePropertiesIdentifierEXT.PNEXT); }
    /** Unsafe version of {@link #pipelineIdentifier}. */
    public static ByteBuffer npipelineIdentifier(long struct) { return memByteBuffer(struct + VkPipelinePropertiesIdentifierEXT.PIPELINEIDENTIFIER, VK_UUID_SIZE); }
    /** Unsafe version of {@link #pipelineIdentifier(int) pipelineIdentifier}. */
    public static byte npipelineIdentifier(long struct, int index) {
        return UNSAFE.getByte(null, struct + VkPipelinePropertiesIdentifierEXT.PIPELINEIDENTIFIER + check(index, VK_UUID_SIZE) * 1);
    }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPipelinePropertiesIdentifierEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPipelinePropertiesIdentifierEXT.PNEXT, value); }
    /** Unsafe version of {@link #pipelineIdentifier(ByteBuffer) pipelineIdentifier}. */
    public static void npipelineIdentifier(long struct, ByteBuffer value) {
        if (CHECKS) { checkGT(value, VK_UUID_SIZE); }
        memCopy(memAddress(value), struct + VkPipelinePropertiesIdentifierEXT.PIPELINEIDENTIFIER, value.remaining() * 1);
    }
    /** Unsafe version of {@link #pipelineIdentifier(int, byte) pipelineIdentifier}. */
    public static void npipelineIdentifier(long struct, int index, byte value) {
        UNSAFE.putByte(null, struct + VkPipelinePropertiesIdentifierEXT.PIPELINEIDENTIFIER + check(index, VK_UUID_SIZE) * 1, value);
    }

    // -----------------------------------

    /** An array of {@link VkPipelinePropertiesIdentifierEXT} structs. */
    public static class Buffer extends StructBuffer<VkPipelinePropertiesIdentifierEXT, Buffer> implements NativeResource {

        private static final VkPipelinePropertiesIdentifierEXT ELEMENT_FACTORY = VkPipelinePropertiesIdentifierEXT.create(-1L);

        /**
         * Creates a new {@code VkPipelinePropertiesIdentifierEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPipelinePropertiesIdentifierEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPipelinePropertiesIdentifierEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPipelinePropertiesIdentifierEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPipelinePropertiesIdentifierEXT.nsType(address()); }
        /** @return the value of the {@link VkPipelinePropertiesIdentifierEXT#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPipelinePropertiesIdentifierEXT.npNext(address()); }
        /** @return a {@link ByteBuffer} view of the {@link VkPipelinePropertiesIdentifierEXT#pipelineIdentifier} field. */
        @NativeType("uint8_t[VK_UUID_SIZE]")
        public ByteBuffer pipelineIdentifier() { return VkPipelinePropertiesIdentifierEXT.npipelineIdentifier(address()); }
        /** @return the value at the specified index of the {@link VkPipelinePropertiesIdentifierEXT#pipelineIdentifier} field. */
        @NativeType("uint8_t")
        public byte pipelineIdentifier(int index) { return VkPipelinePropertiesIdentifierEXT.npipelineIdentifier(address(), index); }

        /** Sets the specified value to the {@link VkPipelinePropertiesIdentifierEXT#sType} field. */
        public VkPipelinePropertiesIdentifierEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPipelinePropertiesIdentifierEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTPipelineProperties#VK_STRUCTURE_TYPE_PIPELINE_PROPERTIES_IDENTIFIER_EXT STRUCTURE_TYPE_PIPELINE_PROPERTIES_IDENTIFIER_EXT} value to the {@link VkPipelinePropertiesIdentifierEXT#sType} field. */
        public VkPipelinePropertiesIdentifierEXT.Buffer sType$Default() { return sType(EXTPipelineProperties.VK_STRUCTURE_TYPE_PIPELINE_PROPERTIES_IDENTIFIER_EXT); }
        /** Sets the specified value to the {@link VkPipelinePropertiesIdentifierEXT#pNext} field. */
        public VkPipelinePropertiesIdentifierEXT.Buffer pNext(@NativeType("void *") long value) { VkPipelinePropertiesIdentifierEXT.npNext(address(), value); return this; }
        /** Copies the specified {@link ByteBuffer} to the {@link VkPipelinePropertiesIdentifierEXT#pipelineIdentifier} field. */
        public VkPipelinePropertiesIdentifierEXT.Buffer pipelineIdentifier(@NativeType("uint8_t[VK_UUID_SIZE]") ByteBuffer value) { VkPipelinePropertiesIdentifierEXT.npipelineIdentifier(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@link VkPipelinePropertiesIdentifierEXT#pipelineIdentifier} field. */
        public VkPipelinePropertiesIdentifierEXT.Buffer pipelineIdentifier(int index, @NativeType("uint8_t") byte value) { VkPipelinePropertiesIdentifierEXT.npipelineIdentifier(address(), index, value); return this; }

    }

}