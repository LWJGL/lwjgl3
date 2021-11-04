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

/**
 * Specify validation features to enable or disable for a Vulkan instance.
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>If the {@code pEnabledValidationFeatures} array contains {@link EXTValidationFeatures#VK_VALIDATION_FEATURE_ENABLE_GPU_ASSISTED_RESERVE_BINDING_SLOT_EXT VALIDATION_FEATURE_ENABLE_GPU_ASSISTED_RESERVE_BINDING_SLOT_EXT}, then it <b>must</b> also contain {@link EXTValidationFeatures#VK_VALIDATION_FEATURE_ENABLE_GPU_ASSISTED_EXT VALIDATION_FEATURE_ENABLE_GPU_ASSISTED_EXT}</li>
 * <li>If the {@code pEnabledValidationFeatures} array contains {@link EXTValidationFeatures#VK_VALIDATION_FEATURE_ENABLE_DEBUG_PRINTF_EXT VALIDATION_FEATURE_ENABLE_DEBUG_PRINTF_EXT}, then it <b>must</b> not contain {@link EXTValidationFeatures#VK_VALIDATION_FEATURE_ENABLE_GPU_ASSISTED_EXT VALIDATION_FEATURE_ENABLE_GPU_ASSISTED_EXT}</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTValidationFeatures#VK_STRUCTURE_TYPE_VALIDATION_FEATURES_EXT STRUCTURE_TYPE_VALIDATION_FEATURES_EXT}</li>
 * <li>If {@code enabledValidationFeatureCount} is not 0, {@code pEnabledValidationFeatures} <b>must</b> be a valid pointer to an array of {@code enabledValidationFeatureCount} valid {@code VkValidationFeatureEnableEXT} values</li>
 * <li>If {@code disabledValidationFeatureCount} is not 0, {@code pDisabledValidationFeatures} <b>must</b> be a valid pointer to an array of {@code disabledValidationFeatureCount} valid {@code VkValidationFeatureDisableEXT} values</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkValidationFeaturesEXT {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     uint32_t {@link #enabledValidationFeatureCount};
 *     VkValidationFeatureEnableEXT const * {@link #pEnabledValidationFeatures};
 *     uint32_t {@link #disabledValidationFeatureCount};
 *     VkValidationFeatureDisableEXT const * {@link #pDisabledValidationFeatures};
 * }</code></pre>
 */
public class VkValidationFeaturesEXT extends Struct implements NativeResource {

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

    /** the type of this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** the number of features to enable. */
    @NativeType("uint32_t")
    public int enabledValidationFeatureCount() { return nenabledValidationFeatureCount(address()); }
    /** a pointer to an array of {@code VkValidationFeatureEnableEXT} values specifying the validation features to be enabled. */
    @Nullable
    @NativeType("VkValidationFeatureEnableEXT const *")
    public IntBuffer pEnabledValidationFeatures() { return npEnabledValidationFeatures(address()); }
    /** the number of features to disable. */
    @NativeType("uint32_t")
    public int disabledValidationFeatureCount() { return ndisabledValidationFeatureCount(address()); }
    /** a pointer to an array of {@code VkValidationFeatureDisableEXT} values specifying the validation features to be disabled. */
    @Nullable
    @NativeType("VkValidationFeatureDisableEXT const *")
    public IntBuffer pDisabledValidationFeatures() { return npDisabledValidationFeatures(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkValidationFeaturesEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTValidationFeatures#VK_STRUCTURE_TYPE_VALIDATION_FEATURES_EXT STRUCTURE_TYPE_VALIDATION_FEATURES_EXT} value to the {@link #sType} field. */
    public VkValidationFeaturesEXT sType$Default() { return sType(EXTValidationFeatures.VK_STRUCTURE_TYPE_VALIDATION_FEATURES_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkValidationFeaturesEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@link #pEnabledValidationFeatures} field. */
    public VkValidationFeaturesEXT pEnabledValidationFeatures(@Nullable @NativeType("VkValidationFeatureEnableEXT const *") IntBuffer value) { npEnabledValidationFeatures(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@link #pDisabledValidationFeatures} field. */
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
        return wrap(VkValidationFeaturesEXT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkValidationFeaturesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkValidationFeaturesEXT calloc() {
        return wrap(VkValidationFeaturesEXT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkValidationFeaturesEXT} instance allocated with {@link BufferUtils}. */
    public static VkValidationFeaturesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkValidationFeaturesEXT.class, memAddress(container), container);
    }

    /** Returns a new {@code VkValidationFeaturesEXT} instance for the specified memory address. */
    public static VkValidationFeaturesEXT create(long address) {
        return wrap(VkValidationFeaturesEXT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkValidationFeaturesEXT createSafe(long address) {
        return address == NULL ? null : wrap(VkValidationFeaturesEXT.class, address);
    }

    /**
     * Returns a new {@link VkValidationFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkValidationFeaturesEXT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkValidationFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkValidationFeaturesEXT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkValidationFeaturesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkValidationFeaturesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkValidationFeaturesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkValidationFeaturesEXT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkValidationFeaturesEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
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
        return wrap(VkValidationFeaturesEXT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkValidationFeaturesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkValidationFeaturesEXT calloc(MemoryStack stack) {
        return wrap(VkValidationFeaturesEXT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkValidationFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkValidationFeaturesEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkValidationFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkValidationFeaturesEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkValidationFeaturesEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkValidationFeaturesEXT.PNEXT); }
    /** Unsafe version of {@link #enabledValidationFeatureCount}. */
    public static int nenabledValidationFeatureCount(long struct) { return UNSAFE.getInt(null, struct + VkValidationFeaturesEXT.ENABLEDVALIDATIONFEATURECOUNT); }
    /** Unsafe version of {@link #pEnabledValidationFeatures() pEnabledValidationFeatures}. */
    @Nullable public static IntBuffer npEnabledValidationFeatures(long struct) { return memIntBufferSafe(memGetAddress(struct + VkValidationFeaturesEXT.PENABLEDVALIDATIONFEATURES), nenabledValidationFeatureCount(struct)); }
    /** Unsafe version of {@link #disabledValidationFeatureCount}. */
    public static int ndisabledValidationFeatureCount(long struct) { return UNSAFE.getInt(null, struct + VkValidationFeaturesEXT.DISABLEDVALIDATIONFEATURECOUNT); }
    /** Unsafe version of {@link #pDisabledValidationFeatures() pDisabledValidationFeatures}. */
    @Nullable public static IntBuffer npDisabledValidationFeatures(long struct) { return memIntBufferSafe(memGetAddress(struct + VkValidationFeaturesEXT.PDISABLEDVALIDATIONFEATURES), ndisabledValidationFeatureCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkValidationFeaturesEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkValidationFeaturesEXT.PNEXT, value); }
    /** Sets the specified value to the {@code enabledValidationFeatureCount} field of the specified {@code struct}. */
    public static void nenabledValidationFeatureCount(long struct, int value) { UNSAFE.putInt(null, struct + VkValidationFeaturesEXT.ENABLEDVALIDATIONFEATURECOUNT, value); }
    /** Unsafe version of {@link #pEnabledValidationFeatures(IntBuffer) pEnabledValidationFeatures}. */
    public static void npEnabledValidationFeatures(long struct, @Nullable IntBuffer value) { memPutAddress(struct + VkValidationFeaturesEXT.PENABLEDVALIDATIONFEATURES, memAddressSafe(value)); nenabledValidationFeatureCount(struct, value == null ? 0 : value.remaining()); }
    /** Sets the specified value to the {@code disabledValidationFeatureCount} field of the specified {@code struct}. */
    public static void ndisabledValidationFeatureCount(long struct, int value) { UNSAFE.putInt(null, struct + VkValidationFeaturesEXT.DISABLEDVALIDATIONFEATURECOUNT, value); }
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
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkValidationFeaturesEXT#SIZEOF}, and its mark will be undefined.
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
        protected VkValidationFeaturesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkValidationFeaturesEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkValidationFeaturesEXT.nsType(address()); }
        /** @return the value of the {@link VkValidationFeaturesEXT#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkValidationFeaturesEXT.npNext(address()); }
        /** @return the value of the {@link VkValidationFeaturesEXT#enabledValidationFeatureCount} field. */
        @NativeType("uint32_t")
        public int enabledValidationFeatureCount() { return VkValidationFeaturesEXT.nenabledValidationFeatureCount(address()); }
        /** @return a {@link IntBuffer} view of the data pointed to by the {@link VkValidationFeaturesEXT#pEnabledValidationFeatures} field. */
        @Nullable
        @NativeType("VkValidationFeatureEnableEXT const *")
        public IntBuffer pEnabledValidationFeatures() { return VkValidationFeaturesEXT.npEnabledValidationFeatures(address()); }
        /** @return the value of the {@link VkValidationFeaturesEXT#disabledValidationFeatureCount} field. */
        @NativeType("uint32_t")
        public int disabledValidationFeatureCount() { return VkValidationFeaturesEXT.ndisabledValidationFeatureCount(address()); }
        /** @return a {@link IntBuffer} view of the data pointed to by the {@link VkValidationFeaturesEXT#pDisabledValidationFeatures} field. */
        @Nullable
        @NativeType("VkValidationFeatureDisableEXT const *")
        public IntBuffer pDisabledValidationFeatures() { return VkValidationFeaturesEXT.npDisabledValidationFeatures(address()); }

        /** Sets the specified value to the {@link VkValidationFeaturesEXT#sType} field. */
        public VkValidationFeaturesEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkValidationFeaturesEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTValidationFeatures#VK_STRUCTURE_TYPE_VALIDATION_FEATURES_EXT STRUCTURE_TYPE_VALIDATION_FEATURES_EXT} value to the {@link VkValidationFeaturesEXT#sType} field. */
        public VkValidationFeaturesEXT.Buffer sType$Default() { return sType(EXTValidationFeatures.VK_STRUCTURE_TYPE_VALIDATION_FEATURES_EXT); }
        /** Sets the specified value to the {@link VkValidationFeaturesEXT#pNext} field. */
        public VkValidationFeaturesEXT.Buffer pNext(@NativeType("void const *") long value) { VkValidationFeaturesEXT.npNext(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@link VkValidationFeaturesEXT#pEnabledValidationFeatures} field. */
        public VkValidationFeaturesEXT.Buffer pEnabledValidationFeatures(@Nullable @NativeType("VkValidationFeatureEnableEXT const *") IntBuffer value) { VkValidationFeaturesEXT.npEnabledValidationFeatures(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@link VkValidationFeaturesEXT#pDisabledValidationFeatures} field. */
        public VkValidationFeaturesEXT.Buffer pDisabledValidationFeatures(@Nullable @NativeType("VkValidationFeatureDisableEXT const *") IntBuffer value) { VkValidationFeaturesEXT.npDisabledValidationFeatures(address(), value); return this; }

    }

}