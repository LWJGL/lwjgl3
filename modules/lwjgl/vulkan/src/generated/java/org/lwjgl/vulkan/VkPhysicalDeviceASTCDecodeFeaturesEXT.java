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
 * Structure describing ASTC decode mode features.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkPhysicalDeviceASTCDecodeFeaturesEXT} structure is included in the {@code pNext} chain of {@link VkPhysicalDeviceFeatures2}, it is filled with values indicating whether each feature is supported. {@link VkPhysicalDeviceASTCDecodeFeaturesEXT} <b>can</b> also be included in the {@code pNext} chain of {@link VK10#vkCreateDevice CreateDevice} to enable features.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTAstcDecodeMode#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_ASTC_DECODE_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_ASTC_DECODE_FEATURES_EXT}</li>
 * </ul>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code decodeModeSharedExponent} &ndash; indicates whether the implementation supports decoding ASTC compressed formats to {@link VK10#VK_FORMAT_E5B9G9R9_UFLOAT_PACK32 FORMAT_E5B9G9R9_UFLOAT_PACK32} internal precision.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceASTCDecodeFeaturesEXT {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 decodeModeSharedExponent;
 * }</code></pre>
 */
public class VkPhysicalDeviceASTCDecodeFeaturesEXT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        DECODEMODESHAREDEXPONENT;

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
        DECODEMODESHAREDEXPONENT = layout.offsetof(2);
    }

    /**
     * Creates a {@code VkPhysicalDeviceASTCDecodeFeaturesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceASTCDecodeFeaturesEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** Returns the value of the {@code pNext} field. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** Returns the value of the {@code decodeModeSharedExponent} field. */
    @NativeType("VkBool32")
    public boolean decodeModeSharedExponent() { return ndecodeModeSharedExponent(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceASTCDecodeFeaturesEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceASTCDecodeFeaturesEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code decodeModeSharedExponent} field. */
    public VkPhysicalDeviceASTCDecodeFeaturesEXT decodeModeSharedExponent(@NativeType("VkBool32") boolean value) { ndecodeModeSharedExponent(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceASTCDecodeFeaturesEXT set(
        int sType,
        long pNext,
        boolean decodeModeSharedExponent
    ) {
        sType(sType);
        pNext(pNext);
        decodeModeSharedExponent(decodeModeSharedExponent);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceASTCDecodeFeaturesEXT set(VkPhysicalDeviceASTCDecodeFeaturesEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceASTCDecodeFeaturesEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceASTCDecodeFeaturesEXT malloc() {
        return wrap(VkPhysicalDeviceASTCDecodeFeaturesEXT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceASTCDecodeFeaturesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceASTCDecodeFeaturesEXT calloc() {
        return wrap(VkPhysicalDeviceASTCDecodeFeaturesEXT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceASTCDecodeFeaturesEXT} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceASTCDecodeFeaturesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPhysicalDeviceASTCDecodeFeaturesEXT.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceASTCDecodeFeaturesEXT} instance for the specified memory address. */
    public static VkPhysicalDeviceASTCDecodeFeaturesEXT create(long address) {
        return wrap(VkPhysicalDeviceASTCDecodeFeaturesEXT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceASTCDecodeFeaturesEXT createSafe(long address) {
        return address == NULL ? null : wrap(VkPhysicalDeviceASTCDecodeFeaturesEXT.class, address);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceASTCDecodeFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceASTCDecodeFeaturesEXT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceASTCDecodeFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceASTCDecodeFeaturesEXT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceASTCDecodeFeaturesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceASTCDecodeFeaturesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPhysicalDeviceASTCDecodeFeaturesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceASTCDecodeFeaturesEXT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceASTCDecodeFeaturesEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceASTCDecodeFeaturesEXT} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkPhysicalDeviceASTCDecodeFeaturesEXT mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code VkPhysicalDeviceASTCDecodeFeaturesEXT} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkPhysicalDeviceASTCDecodeFeaturesEXT callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code VkPhysicalDeviceASTCDecodeFeaturesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceASTCDecodeFeaturesEXT mallocStack(MemoryStack stack) {
        return wrap(VkPhysicalDeviceASTCDecodeFeaturesEXT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPhysicalDeviceASTCDecodeFeaturesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceASTCDecodeFeaturesEXT callocStack(MemoryStack stack) {
        return wrap(VkPhysicalDeviceASTCDecodeFeaturesEXT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceASTCDecodeFeaturesEXT.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceASTCDecodeFeaturesEXT.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkPhysicalDeviceASTCDecodeFeaturesEXT.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceASTCDecodeFeaturesEXT.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkPhysicalDeviceASTCDecodeFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceASTCDecodeFeaturesEXT.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceASTCDecodeFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceASTCDecodeFeaturesEXT.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceASTCDecodeFeaturesEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceASTCDecodeFeaturesEXT.PNEXT); }
    /** Unsafe version of {@link #decodeModeSharedExponent}. */
    public static int ndecodeModeSharedExponent(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceASTCDecodeFeaturesEXT.DECODEMODESHAREDEXPONENT); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceASTCDecodeFeaturesEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceASTCDecodeFeaturesEXT.PNEXT, value); }
    /** Unsafe version of {@link #decodeModeSharedExponent(boolean) decodeModeSharedExponent}. */
    public static void ndecodeModeSharedExponent(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceASTCDecodeFeaturesEXT.DECODEMODESHAREDEXPONENT, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceASTCDecodeFeaturesEXT} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceASTCDecodeFeaturesEXT, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceASTCDecodeFeaturesEXT ELEMENT_FACTORY = VkPhysicalDeviceASTCDecodeFeaturesEXT.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceASTCDecodeFeaturesEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceASTCDecodeFeaturesEXT#SIZEOF}, and its mark will be undefined.
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
        protected VkPhysicalDeviceASTCDecodeFeaturesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceASTCDecodeFeaturesEXT.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceASTCDecodeFeaturesEXT.npNext(address()); }
        /** Returns the value of the {@code decodeModeSharedExponent} field. */
        @NativeType("VkBool32")
        public boolean decodeModeSharedExponent() { return VkPhysicalDeviceASTCDecodeFeaturesEXT.ndecodeModeSharedExponent(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceASTCDecodeFeaturesEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceASTCDecodeFeaturesEXT.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceASTCDecodeFeaturesEXT.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceASTCDecodeFeaturesEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code decodeModeSharedExponent} field. */
        public VkPhysicalDeviceASTCDecodeFeaturesEXT.Buffer decodeModeSharedExponent(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceASTCDecodeFeaturesEXT.ndecodeModeSharedExponent(address(), value ? 1 : 0); return this; }

    }

}