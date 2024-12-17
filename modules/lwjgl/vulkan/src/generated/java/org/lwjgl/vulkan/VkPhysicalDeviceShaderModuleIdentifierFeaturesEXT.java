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
 * struct VkPhysicalDeviceShaderModuleIdentifierFeaturesEXT {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 shaderModuleIdentifier;
 * }}</pre>
 */
public class VkPhysicalDeviceShaderModuleIdentifierFeaturesEXT extends Struct<VkPhysicalDeviceShaderModuleIdentifierFeaturesEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SHADERMODULEIDENTIFIER;

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
        SHADERMODULEIDENTIFIER = layout.offsetof(2);
    }

    protected VkPhysicalDeviceShaderModuleIdentifierFeaturesEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceShaderModuleIdentifierFeaturesEXT create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceShaderModuleIdentifierFeaturesEXT(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceShaderModuleIdentifierFeaturesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceShaderModuleIdentifierFeaturesEXT(ByteBuffer container) {
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
    /** @return the value of the {@code shaderModuleIdentifier} field. */
    @NativeType("VkBool32")
    public boolean shaderModuleIdentifier() { return nshaderModuleIdentifier(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceShaderModuleIdentifierFeaturesEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTShaderModuleIdentifier#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_MODULE_IDENTIFIER_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_MODULE_IDENTIFIER_FEATURES_EXT} value to the {@code sType} field. */
    public VkPhysicalDeviceShaderModuleIdentifierFeaturesEXT sType$Default() { return sType(EXTShaderModuleIdentifier.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_MODULE_IDENTIFIER_FEATURES_EXT); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceShaderModuleIdentifierFeaturesEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code shaderModuleIdentifier} field. */
    public VkPhysicalDeviceShaderModuleIdentifierFeaturesEXT shaderModuleIdentifier(@NativeType("VkBool32") boolean value) { nshaderModuleIdentifier(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceShaderModuleIdentifierFeaturesEXT set(
        int sType,
        long pNext,
        boolean shaderModuleIdentifier
    ) {
        sType(sType);
        pNext(pNext);
        shaderModuleIdentifier(shaderModuleIdentifier);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceShaderModuleIdentifierFeaturesEXT set(VkPhysicalDeviceShaderModuleIdentifierFeaturesEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceShaderModuleIdentifierFeaturesEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceShaderModuleIdentifierFeaturesEXT malloc() {
        return new VkPhysicalDeviceShaderModuleIdentifierFeaturesEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceShaderModuleIdentifierFeaturesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceShaderModuleIdentifierFeaturesEXT calloc() {
        return new VkPhysicalDeviceShaderModuleIdentifierFeaturesEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceShaderModuleIdentifierFeaturesEXT} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceShaderModuleIdentifierFeaturesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceShaderModuleIdentifierFeaturesEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceShaderModuleIdentifierFeaturesEXT} instance for the specified memory address. */
    public static VkPhysicalDeviceShaderModuleIdentifierFeaturesEXT create(long address) {
        return new VkPhysicalDeviceShaderModuleIdentifierFeaturesEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceShaderModuleIdentifierFeaturesEXT createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceShaderModuleIdentifierFeaturesEXT(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderModuleIdentifierFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderModuleIdentifierFeaturesEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderModuleIdentifierFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderModuleIdentifierFeaturesEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderModuleIdentifierFeaturesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderModuleIdentifierFeaturesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceShaderModuleIdentifierFeaturesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderModuleIdentifierFeaturesEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceShaderModuleIdentifierFeaturesEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceShaderModuleIdentifierFeaturesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceShaderModuleIdentifierFeaturesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDeviceShaderModuleIdentifierFeaturesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceShaderModuleIdentifierFeaturesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceShaderModuleIdentifierFeaturesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDeviceShaderModuleIdentifierFeaturesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderModuleIdentifierFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderModuleIdentifierFeaturesEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderModuleIdentifierFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderModuleIdentifierFeaturesEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceShaderModuleIdentifierFeaturesEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceShaderModuleIdentifierFeaturesEXT.PNEXT); }
    /** Unsafe version of {@link #shaderModuleIdentifier}. */
    public static int nshaderModuleIdentifier(long struct) { return memGetInt(struct + VkPhysicalDeviceShaderModuleIdentifierFeaturesEXT.SHADERMODULEIDENTIFIER); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceShaderModuleIdentifierFeaturesEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceShaderModuleIdentifierFeaturesEXT.PNEXT, value); }
    /** Unsafe version of {@link #shaderModuleIdentifier(boolean) shaderModuleIdentifier}. */
    public static void nshaderModuleIdentifier(long struct, int value) { memPutInt(struct + VkPhysicalDeviceShaderModuleIdentifierFeaturesEXT.SHADERMODULEIDENTIFIER, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceShaderModuleIdentifierFeaturesEXT} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceShaderModuleIdentifierFeaturesEXT, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceShaderModuleIdentifierFeaturesEXT ELEMENT_FACTORY = VkPhysicalDeviceShaderModuleIdentifierFeaturesEXT.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceShaderModuleIdentifierFeaturesEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceShaderModuleIdentifierFeaturesEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceShaderModuleIdentifierFeaturesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceShaderModuleIdentifierFeaturesEXT.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceShaderModuleIdentifierFeaturesEXT.npNext(address()); }
        /** @return the value of the {@code shaderModuleIdentifier} field. */
        @NativeType("VkBool32")
        public boolean shaderModuleIdentifier() { return VkPhysicalDeviceShaderModuleIdentifierFeaturesEXT.nshaderModuleIdentifier(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceShaderModuleIdentifierFeaturesEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceShaderModuleIdentifierFeaturesEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTShaderModuleIdentifier#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_MODULE_IDENTIFIER_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_MODULE_IDENTIFIER_FEATURES_EXT} value to the {@code sType} field. */
        public VkPhysicalDeviceShaderModuleIdentifierFeaturesEXT.Buffer sType$Default() { return sType(EXTShaderModuleIdentifier.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_MODULE_IDENTIFIER_FEATURES_EXT); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceShaderModuleIdentifierFeaturesEXT.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceShaderModuleIdentifierFeaturesEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code shaderModuleIdentifier} field. */
        public VkPhysicalDeviceShaderModuleIdentifierFeaturesEXT.Buffer shaderModuleIdentifier(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceShaderModuleIdentifierFeaturesEXT.nshaderModuleIdentifier(address(), value ? 1 : 0); return this; }

    }

}