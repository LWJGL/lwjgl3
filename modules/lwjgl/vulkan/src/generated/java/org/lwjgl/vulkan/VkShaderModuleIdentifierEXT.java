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

import static org.lwjgl.vulkan.EXTShaderModuleIdentifier.*;

/**
 * A unique identifier for a shader module.
 * 
 * <h5>Description</h5>
 * 
 * <p>Any returned values beyond the first {@code identifierSize} bytes are undefined. Implementations <b>must</b> return an {@code identifierSize} greater than 0, and less-or-equal to {@link EXTShaderModuleIdentifier#VK_MAX_SHADER_MODULE_IDENTIFIER_SIZE_EXT MAX_SHADER_MODULE_IDENTIFIER_SIZE_EXT}.</p>
 * 
 * <p>Two identifiers are considered equal if {@code identifierSize} is equal and the first {@code identifierSize} bytes of {@code identifier} compare equal.</p>
 * 
 * <p>Implementations <b>may</b> return a different {@code identifierSize} for different modules. Implementations <b>should</b> ensure that {@code identifierSize} is large enough to uniquely define a shader module.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTShaderModuleIdentifier#VK_STRUCTURE_TYPE_SHADER_MODULE_IDENTIFIER_EXT STRUCTURE_TYPE_SHADER_MODULE_IDENTIFIER_EXT}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link EXTShaderModuleIdentifier#vkGetShaderModuleCreateInfoIdentifierEXT GetShaderModuleCreateInfoIdentifierEXT}, {@link EXTShaderModuleIdentifier#vkGetShaderModuleIdentifierEXT GetShaderModuleIdentifierEXT}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkShaderModuleIdentifierEXT {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     uint32_t {@link #identifierSize};
 *     uint8_t {@link #identifier}[VK_MAX_SHADER_MODULE_IDENTIFIER_SIZE_EXT];
 * }</code></pre>
 */
public class VkShaderModuleIdentifierEXT extends Struct<VkShaderModuleIdentifierEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        IDENTIFIERSIZE,
        IDENTIFIER;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __array(1, VK_MAX_SHADER_MODULE_IDENTIFIER_SIZE_EXT)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        IDENTIFIERSIZE = layout.offsetof(2);
        IDENTIFIER = layout.offsetof(3);
    }

    protected VkShaderModuleIdentifierEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkShaderModuleIdentifierEXT create(long address, @Nullable ByteBuffer container) {
        return new VkShaderModuleIdentifierEXT(address, container);
    }

    /**
     * Creates a {@code VkShaderModuleIdentifierEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkShaderModuleIdentifierEXT(ByteBuffer container) {
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
    /** the size, in bytes, of valid data returned in {@code identifier}. */
    @NativeType("uint32_t")
    public int identifierSize() { return nidentifierSize(address()); }
    /** a buffer of opaque data specifying an identifier. */
    @NativeType("uint8_t[VK_MAX_SHADER_MODULE_IDENTIFIER_SIZE_EXT]")
    public ByteBuffer identifier() { return nidentifier(address()); }
    /** a buffer of opaque data specifying an identifier. */
    @NativeType("uint8_t")
    public byte identifier(int index) { return nidentifier(address(), index); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkShaderModuleIdentifierEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTShaderModuleIdentifier#VK_STRUCTURE_TYPE_SHADER_MODULE_IDENTIFIER_EXT STRUCTURE_TYPE_SHADER_MODULE_IDENTIFIER_EXT} value to the {@link #sType} field. */
    public VkShaderModuleIdentifierEXT sType$Default() { return sType(EXTShaderModuleIdentifier.VK_STRUCTURE_TYPE_SHADER_MODULE_IDENTIFIER_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkShaderModuleIdentifierEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkShaderModuleIdentifierEXT set(
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
    public VkShaderModuleIdentifierEXT set(VkShaderModuleIdentifierEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkShaderModuleIdentifierEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkShaderModuleIdentifierEXT malloc() {
        return new VkShaderModuleIdentifierEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkShaderModuleIdentifierEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkShaderModuleIdentifierEXT calloc() {
        return new VkShaderModuleIdentifierEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkShaderModuleIdentifierEXT} instance allocated with {@link BufferUtils}. */
    public static VkShaderModuleIdentifierEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkShaderModuleIdentifierEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkShaderModuleIdentifierEXT} instance for the specified memory address. */
    public static VkShaderModuleIdentifierEXT create(long address) {
        return new VkShaderModuleIdentifierEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkShaderModuleIdentifierEXT createSafe(long address) {
        return address == NULL ? null : new VkShaderModuleIdentifierEXT(address, null);
    }

    /**
     * Returns a new {@link VkShaderModuleIdentifierEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkShaderModuleIdentifierEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkShaderModuleIdentifierEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkShaderModuleIdentifierEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkShaderModuleIdentifierEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkShaderModuleIdentifierEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkShaderModuleIdentifierEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkShaderModuleIdentifierEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkShaderModuleIdentifierEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkShaderModuleIdentifierEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkShaderModuleIdentifierEXT malloc(MemoryStack stack) {
        return new VkShaderModuleIdentifierEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkShaderModuleIdentifierEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkShaderModuleIdentifierEXT calloc(MemoryStack stack) {
        return new VkShaderModuleIdentifierEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkShaderModuleIdentifierEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkShaderModuleIdentifierEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkShaderModuleIdentifierEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkShaderModuleIdentifierEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkShaderModuleIdentifierEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkShaderModuleIdentifierEXT.PNEXT); }
    /** Unsafe version of {@link #identifierSize}. */
    public static int nidentifierSize(long struct) { return UNSAFE.getInt(null, struct + VkShaderModuleIdentifierEXT.IDENTIFIERSIZE); }
    /** Unsafe version of {@link #identifier}. */
    public static ByteBuffer nidentifier(long struct) { return memByteBuffer(struct + VkShaderModuleIdentifierEXT.IDENTIFIER, VK_MAX_SHADER_MODULE_IDENTIFIER_SIZE_EXT); }
    /** Unsafe version of {@link #identifier(int) identifier}. */
    public static byte nidentifier(long struct, int index) {
        return UNSAFE.getByte(null, struct + VkShaderModuleIdentifierEXT.IDENTIFIER + check(index, VK_MAX_SHADER_MODULE_IDENTIFIER_SIZE_EXT) * 1);
    }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkShaderModuleIdentifierEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkShaderModuleIdentifierEXT.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkShaderModuleIdentifierEXT} structs. */
    public static class Buffer extends StructBuffer<VkShaderModuleIdentifierEXT, Buffer> implements NativeResource {

        private static final VkShaderModuleIdentifierEXT ELEMENT_FACTORY = VkShaderModuleIdentifierEXT.create(-1L);

        /**
         * Creates a new {@code VkShaderModuleIdentifierEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkShaderModuleIdentifierEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkShaderModuleIdentifierEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkShaderModuleIdentifierEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkShaderModuleIdentifierEXT.nsType(address()); }
        /** @return the value of the {@link VkShaderModuleIdentifierEXT#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkShaderModuleIdentifierEXT.npNext(address()); }
        /** @return the value of the {@link VkShaderModuleIdentifierEXT#identifierSize} field. */
        @NativeType("uint32_t")
        public int identifierSize() { return VkShaderModuleIdentifierEXT.nidentifierSize(address()); }
        /** @return a {@link ByteBuffer} view of the {@link VkShaderModuleIdentifierEXT#identifier} field. */
        @NativeType("uint8_t[VK_MAX_SHADER_MODULE_IDENTIFIER_SIZE_EXT]")
        public ByteBuffer identifier() { return VkShaderModuleIdentifierEXT.nidentifier(address()); }
        /** @return the value at the specified index of the {@link VkShaderModuleIdentifierEXT#identifier} field. */
        @NativeType("uint8_t")
        public byte identifier(int index) { return VkShaderModuleIdentifierEXT.nidentifier(address(), index); }

        /** Sets the specified value to the {@link VkShaderModuleIdentifierEXT#sType} field. */
        public VkShaderModuleIdentifierEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkShaderModuleIdentifierEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTShaderModuleIdentifier#VK_STRUCTURE_TYPE_SHADER_MODULE_IDENTIFIER_EXT STRUCTURE_TYPE_SHADER_MODULE_IDENTIFIER_EXT} value to the {@link VkShaderModuleIdentifierEXT#sType} field. */
        public VkShaderModuleIdentifierEXT.Buffer sType$Default() { return sType(EXTShaderModuleIdentifier.VK_STRUCTURE_TYPE_SHADER_MODULE_IDENTIFIER_EXT); }
        /** Sets the specified value to the {@link VkShaderModuleIdentifierEXT#pNext} field. */
        public VkShaderModuleIdentifierEXT.Buffer pNext(@NativeType("void *") long value) { VkShaderModuleIdentifierEXT.npNext(address(), value); return this; }

    }

}