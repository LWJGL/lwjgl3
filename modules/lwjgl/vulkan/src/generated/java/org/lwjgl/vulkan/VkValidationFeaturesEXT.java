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

/**
 * <pre>{@code
 * struct VkValidationFeaturesEXT {
 *     VkStructureType sType;
 *     void const * pNext;
 *     uint32_t enabledValidationFeatureCount;
 *     VkValidationFeatureEnableEXT const * pEnabledValidationFeatures;
 *     uint32_t disabledValidationFeatureCount;
 *     VkValidationFeatureDisableEXT const * pDisabledValidationFeatures;
 * }}</pre>
 */
public class VkValidationFeaturesEXT extends Struct<VkValidationFeaturesEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        ENABLEDVALIDATIONFEATURECOUNT,
        PENABLEDVALIDATIONFEATURES,
        DISABLEDVALIDATIONFEATURECOUNT,
        PDISABLEDVALIDATIONFEATURES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        ENABLEDVALIDATIONFEATURECOUNT = layout.offsetof(2);
        PENABLEDVALIDATIONFEATURES = layout.offsetof(3);
        DISABLEDVALIDATIONFEATURECOUNT = layout.offsetof(4);
        PDISABLEDVALIDATIONFEATURES = layout.offsetof(5);
    }

    protected VkValidationFeaturesEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkValidationFeaturesEXT create(long address, @Nullable ByteBuffer container) {
        return new VkValidationFeaturesEXT(address, container);
    }

    /**
     * Creates a {@code VkValidationFeaturesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkValidationFeaturesEXT(ByteBuffer container) {
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
    /** @return the value of the {@code enabledValidationFeatureCount} field. */
    @NativeType("uint32_t")
    public int enabledValidationFeatureCount() { return nenabledValidationFeatureCount(address()); }
    /** @return a {@link IntBuffer} view of the data pointed to by the {@code pEnabledValidationFeatures} field. */
    @NativeType("VkValidationFeatureEnableEXT const *")
    public @Nullable IntBuffer pEnabledValidationFeatures() { return npEnabledValidationFeatures(address()); }
    /** @return the value of the {@code disabledValidationFeatureCount} field. */
    @NativeType("uint32_t")
    public int disabledValidationFeatureCount() { return ndisabledValidationFeatureCount(address()); }
    /** @return a {@link IntBuffer} view of the data pointed to by the {@code pDisabledValidationFeatures} field. */
    @NativeType("VkValidationFeatureDisableEXT const *")
    public @Nullable IntBuffer pDisabledValidationFeatures() { return npDisabledValidationFeatures(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkValidationFeaturesEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTValidationFeatures#VK_STRUCTURE_TYPE_VALIDATION_FEATURES_EXT STRUCTURE_TYPE_VALIDATION_FEATURES_EXT} value to the {@code sType} field. */
    public VkValidationFeaturesEXT sType$Default() { return sType(EXTValidationFeatures.VK_STRUCTURE_TYPE_VALIDATION_FEATURES_EXT); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkValidationFeaturesEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@code pEnabledValidationFeatures} field. */
    public VkValidationFeaturesEXT pEnabledValidationFeatures(@Nullable @NativeType("VkValidationFeatureEnableEXT const *") IntBuffer value) { npEnabledValidationFeatures(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@code pDisabledValidationFeatures} field. */
    public VkValidationFeaturesEXT pDisabledValidationFeatures(@Nullable @NativeType("VkValidationFeatureDisableEXT const *") IntBuffer value) { npDisabledValidationFeatures(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkValidationFeaturesEXT set(
        int sType,
        long pNext,
        @Nullable IntBuffer pEnabledValidationFeatures,
        @Nullable IntBuffer pDisabledValidationFeatures
    ) {
        sType(sType);
        pNext(pNext);
        pEnabledValidationFeatures(pEnabledValidationFeatures);
        pDisabledValidationFeatures(pDisabledValidationFeatures);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkValidationFeaturesEXT set(VkValidationFeaturesEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkValidationFeaturesEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkValidationFeaturesEXT malloc() {
        return new VkValidationFeaturesEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkValidationFeaturesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkValidationFeaturesEXT calloc() {
        return new VkValidationFeaturesEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkValidationFeaturesEXT} instance allocated with {@link BufferUtils}. */
    public static VkValidationFeaturesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkValidationFeaturesEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkValidationFeaturesEXT} instance for the specified memory address. */
    public static VkValidationFeaturesEXT create(long address) {
        return new VkValidationFeaturesEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkValidationFeaturesEXT createSafe(long address) {
        return address == NULL ? null : new VkValidationFeaturesEXT(address, null);
    }

    /**
     * Returns a new {@link VkValidationFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkValidationFeaturesEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkValidationFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkValidationFeaturesEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkValidationFeaturesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkValidationFeaturesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkValidationFeaturesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkValidationFeaturesEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkValidationFeaturesEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkValidationFeaturesEXT mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkValidationFeaturesEXT callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkValidationFeaturesEXT mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkValidationFeaturesEXT callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkValidationFeaturesEXT.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkValidationFeaturesEXT.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkValidationFeaturesEXT.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkValidationFeaturesEXT.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkValidationFeaturesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkValidationFeaturesEXT malloc(MemoryStack stack) {
        return new VkValidationFeaturesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkValidationFeaturesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkValidationFeaturesEXT calloc(MemoryStack stack) {
        return new VkValidationFeaturesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkValidationFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkValidationFeaturesEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkValidationFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkValidationFeaturesEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkValidationFeaturesEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkValidationFeaturesEXT.PNEXT); }
    /** Unsafe version of {@link #enabledValidationFeatureCount}. */
    public static int nenabledValidationFeatureCount(long struct) { return memGetInt(struct + VkValidationFeaturesEXT.ENABLEDVALIDATIONFEATURECOUNT); }
    /** Unsafe version of {@link #pEnabledValidationFeatures() pEnabledValidationFeatures}. */
    public static @Nullable IntBuffer npEnabledValidationFeatures(long struct) { return memIntBufferSafe(memGetAddress(struct + VkValidationFeaturesEXT.PENABLEDVALIDATIONFEATURES), nenabledValidationFeatureCount(struct)); }
    /** Unsafe version of {@link #disabledValidationFeatureCount}. */
    public static int ndisabledValidationFeatureCount(long struct) { return memGetInt(struct + VkValidationFeaturesEXT.DISABLEDVALIDATIONFEATURECOUNT); }
    /** Unsafe version of {@link #pDisabledValidationFeatures() pDisabledValidationFeatures}. */
    public static @Nullable IntBuffer npDisabledValidationFeatures(long struct) { return memIntBufferSafe(memGetAddress(struct + VkValidationFeaturesEXT.PDISABLEDVALIDATIONFEATURES), ndisabledValidationFeatureCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkValidationFeaturesEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkValidationFeaturesEXT.PNEXT, value); }
    /** Sets the specified value to the {@code enabledValidationFeatureCount} field of the specified {@code struct}. */
    public static void nenabledValidationFeatureCount(long struct, int value) { memPutInt(struct + VkValidationFeaturesEXT.ENABLEDVALIDATIONFEATURECOUNT, value); }
    /** Unsafe version of {@link #pEnabledValidationFeatures(IntBuffer) pEnabledValidationFeatures}. */
    public static void npEnabledValidationFeatures(long struct, @Nullable IntBuffer value) { memPutAddress(struct + VkValidationFeaturesEXT.PENABLEDVALIDATIONFEATURES, memAddressSafe(value)); nenabledValidationFeatureCount(struct, value == null ? 0 : value.remaining()); }
    /** Sets the specified value to the {@code disabledValidationFeatureCount} field of the specified {@code struct}. */
    public static void ndisabledValidationFeatureCount(long struct, int value) { memPutInt(struct + VkValidationFeaturesEXT.DISABLEDVALIDATIONFEATURECOUNT, value); }
    /** Unsafe version of {@link #pDisabledValidationFeatures(IntBuffer) pDisabledValidationFeatures}. */
    public static void npDisabledValidationFeatures(long struct, @Nullable IntBuffer value) { memPutAddress(struct + VkValidationFeaturesEXT.PDISABLEDVALIDATIONFEATURES, memAddressSafe(value)); ndisabledValidationFeatureCount(struct, value == null ? 0 : value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        if (nenabledValidationFeatureCount(struct) != 0) {
            check(memGetAddress(struct + VkValidationFeaturesEXT.PENABLEDVALIDATIONFEATURES));
        }
        if (ndisabledValidationFeatureCount(struct) != 0) {
            check(memGetAddress(struct + VkValidationFeaturesEXT.PDISABLEDVALIDATIONFEATURES));
        }
    }

    // -----------------------------------

    /** An array of {@link VkValidationFeaturesEXT} structs. */
    public static class Buffer extends StructBuffer<VkValidationFeaturesEXT, Buffer> implements NativeResource {

        private static final VkValidationFeaturesEXT ELEMENT_FACTORY = VkValidationFeaturesEXT.create(-1L);

        /**
         * Creates a new {@code VkValidationFeaturesEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkValidationFeaturesEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkValidationFeaturesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkValidationFeaturesEXT.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkValidationFeaturesEXT.npNext(address()); }
        /** @return the value of the {@code enabledValidationFeatureCount} field. */
        @NativeType("uint32_t")
        public int enabledValidationFeatureCount() { return VkValidationFeaturesEXT.nenabledValidationFeatureCount(address()); }
        /** @return a {@link IntBuffer} view of the data pointed to by the {@code pEnabledValidationFeatures} field. */
        @NativeType("VkValidationFeatureEnableEXT const *")
        public @Nullable IntBuffer pEnabledValidationFeatures() { return VkValidationFeaturesEXT.npEnabledValidationFeatures(address()); }
        /** @return the value of the {@code disabledValidationFeatureCount} field. */
        @NativeType("uint32_t")
        public int disabledValidationFeatureCount() { return VkValidationFeaturesEXT.ndisabledValidationFeatureCount(address()); }
        /** @return a {@link IntBuffer} view of the data pointed to by the {@code pDisabledValidationFeatures} field. */
        @NativeType("VkValidationFeatureDisableEXT const *")
        public @Nullable IntBuffer pDisabledValidationFeatures() { return VkValidationFeaturesEXT.npDisabledValidationFeatures(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkValidationFeaturesEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkValidationFeaturesEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTValidationFeatures#VK_STRUCTURE_TYPE_VALIDATION_FEATURES_EXT STRUCTURE_TYPE_VALIDATION_FEATURES_EXT} value to the {@code sType} field. */
        public VkValidationFeaturesEXT.Buffer sType$Default() { return sType(EXTValidationFeatures.VK_STRUCTURE_TYPE_VALIDATION_FEATURES_EXT); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkValidationFeaturesEXT.Buffer pNext(@NativeType("void const *") long value) { VkValidationFeaturesEXT.npNext(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@code pEnabledValidationFeatures} field. */
        public VkValidationFeaturesEXT.Buffer pEnabledValidationFeatures(@Nullable @NativeType("VkValidationFeatureEnableEXT const *") IntBuffer value) { VkValidationFeaturesEXT.npEnabledValidationFeatures(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@code pDisabledValidationFeatures} field. */
        public VkValidationFeaturesEXT.Buffer pDisabledValidationFeatures(@Nullable @NativeType("VkValidationFeatureDisableEXT const *") IntBuffer value) { VkValidationFeaturesEXT.npDisabledValidationFeatures(address(), value); return this; }

    }

}