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
 * Specify validation checks to disable for a Vulkan instance.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTValidationFlags#VK_STRUCTURE_TYPE_VALIDATION_FLAGS_EXT STRUCTURE_TYPE_VALIDATION_FLAGS_EXT}</li>
 * <li>{@code pDisabledValidationChecks} <b>must</b> be a valid pointer to an array of {@code disabledValidationCheckCount} valid {@code VkValidationCheckEXT} values</li>
 * <li>{@code disabledValidationCheckCount} <b>must</b> be greater than 0</li>
 * </ul>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code disabledValidationCheckCount} &ndash; the number of checks to disable.</li>
 * <li>{@code pDisabledValidationChecks} &ndash; a pointer to an array of {@code VkValidationCheckEXT} values specifying the validation checks to be disabled.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkValidationFlagsEXT {
 *     VkStructureType sType;
 *     void const * pNext;
 *     uint32_t disabledValidationCheckCount;
 *     VkValidationCheckEXT const * pDisabledValidationChecks;
 * }</code></pre>
 */
public class VkValidationFlagsEXT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        DISABLEDVALIDATIONCHECKCOUNT,
        PDISABLEDVALIDATIONCHECKS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        DISABLEDVALIDATIONCHECKCOUNT = layout.offsetof(2);
        PDISABLEDVALIDATIONCHECKS = layout.offsetof(3);
    }

    /**
     * Creates a {@code VkValidationFlagsEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkValidationFlagsEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** Returns the value of the {@code pNext} field. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** Returns the value of the {@code disabledValidationCheckCount} field. */
    @NativeType("uint32_t")
    public int disabledValidationCheckCount() { return ndisabledValidationCheckCount(address()); }
    /** Returns a {@link IntBuffer} view of the data pointed to by the {@code pDisabledValidationChecks} field. */
    @NativeType("VkValidationCheckEXT const *")
    public IntBuffer pDisabledValidationChecks() { return npDisabledValidationChecks(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkValidationFlagsEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkValidationFlagsEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@code pDisabledValidationChecks} field. */
    public VkValidationFlagsEXT pDisabledValidationChecks(@NativeType("VkValidationCheckEXT const *") IntBuffer value) { npDisabledValidationChecks(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkValidationFlagsEXT set(
        int sType,
        long pNext,
        IntBuffer pDisabledValidationChecks
    ) {
        sType(sType);
        pNext(pNext);
        pDisabledValidationChecks(pDisabledValidationChecks);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkValidationFlagsEXT set(VkValidationFlagsEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkValidationFlagsEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkValidationFlagsEXT malloc() {
        return wrap(VkValidationFlagsEXT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkValidationFlagsEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkValidationFlagsEXT calloc() {
        return wrap(VkValidationFlagsEXT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkValidationFlagsEXT} instance allocated with {@link BufferUtils}. */
    public static VkValidationFlagsEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkValidationFlagsEXT.class, memAddress(container), container);
    }

    /** Returns a new {@code VkValidationFlagsEXT} instance for the specified memory address. */
    public static VkValidationFlagsEXT create(long address) {
        return wrap(VkValidationFlagsEXT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkValidationFlagsEXT createSafe(long address) {
        return address == NULL ? null : wrap(VkValidationFlagsEXT.class, address);
    }

    /**
     * Returns a new {@link VkValidationFlagsEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkValidationFlagsEXT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkValidationFlagsEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkValidationFlagsEXT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkValidationFlagsEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkValidationFlagsEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkValidationFlagsEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkValidationFlagsEXT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkValidationFlagsEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code VkValidationFlagsEXT} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkValidationFlagsEXT mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code VkValidationFlagsEXT} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkValidationFlagsEXT callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code VkValidationFlagsEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkValidationFlagsEXT mallocStack(MemoryStack stack) {
        return wrap(VkValidationFlagsEXT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkValidationFlagsEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkValidationFlagsEXT callocStack(MemoryStack stack) {
        return wrap(VkValidationFlagsEXT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkValidationFlagsEXT.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkValidationFlagsEXT.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkValidationFlagsEXT.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkValidationFlagsEXT.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkValidationFlagsEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkValidationFlagsEXT.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkValidationFlagsEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkValidationFlagsEXT.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkValidationFlagsEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkValidationFlagsEXT.PNEXT); }
    /** Unsafe version of {@link #disabledValidationCheckCount}. */
    public static int ndisabledValidationCheckCount(long struct) { return UNSAFE.getInt(null, struct + VkValidationFlagsEXT.DISABLEDVALIDATIONCHECKCOUNT); }
    /** Unsafe version of {@link #pDisabledValidationChecks() pDisabledValidationChecks}. */
    public static IntBuffer npDisabledValidationChecks(long struct) { return memIntBuffer(memGetAddress(struct + VkValidationFlagsEXT.PDISABLEDVALIDATIONCHECKS), ndisabledValidationCheckCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkValidationFlagsEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkValidationFlagsEXT.PNEXT, value); }
    /** Sets the specified value to the {@code disabledValidationCheckCount} field of the specified {@code struct}. */
    public static void ndisabledValidationCheckCount(long struct, int value) { UNSAFE.putInt(null, struct + VkValidationFlagsEXT.DISABLEDVALIDATIONCHECKCOUNT, value); }
    /** Unsafe version of {@link #pDisabledValidationChecks(IntBuffer) pDisabledValidationChecks}. */
    public static void npDisabledValidationChecks(long struct, IntBuffer value) { memPutAddress(struct + VkValidationFlagsEXT.PDISABLEDVALIDATIONCHECKS, memAddress(value)); ndisabledValidationCheckCount(struct, value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + VkValidationFlagsEXT.PDISABLEDVALIDATIONCHECKS));
    }

    /**
     * Calls {@link #validate(long)} for each struct contained in the specified struct array.
     *
     * @param array the struct array to validate
     * @param count the number of structs in {@code array}
     */
    public static void validate(long array, int count) {
        for (int i = 0; i < count; i++) {
            validate(array + Integer.toUnsignedLong(i) * SIZEOF);
        }
    }

    // -----------------------------------

    /** An array of {@link VkValidationFlagsEXT} structs. */
    public static class Buffer extends StructBuffer<VkValidationFlagsEXT, Buffer> implements NativeResource {

        private static final VkValidationFlagsEXT ELEMENT_FACTORY = VkValidationFlagsEXT.create(-1L);

        /**
         * Creates a new {@code VkValidationFlagsEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkValidationFlagsEXT#SIZEOF}, and its mark will be undefined.
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
        protected VkValidationFlagsEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkValidationFlagsEXT.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkValidationFlagsEXT.npNext(address()); }
        /** Returns the value of the {@code disabledValidationCheckCount} field. */
        @NativeType("uint32_t")
        public int disabledValidationCheckCount() { return VkValidationFlagsEXT.ndisabledValidationCheckCount(address()); }
        /** Returns a {@link IntBuffer} view of the data pointed to by the {@code pDisabledValidationChecks} field. */
        @NativeType("VkValidationCheckEXT const *")
        public IntBuffer pDisabledValidationChecks() { return VkValidationFlagsEXT.npDisabledValidationChecks(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkValidationFlagsEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkValidationFlagsEXT.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkValidationFlagsEXT.Buffer pNext(@NativeType("void const *") long value) { VkValidationFlagsEXT.npNext(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@code pDisabledValidationChecks} field. */
        public VkValidationFlagsEXT.Buffer pDisabledValidationChecks(@NativeType("VkValidationCheckEXT const *") IntBuffer value) { VkValidationFlagsEXT.npDisabledValidationChecks(address(), value); return this; }

    }

}