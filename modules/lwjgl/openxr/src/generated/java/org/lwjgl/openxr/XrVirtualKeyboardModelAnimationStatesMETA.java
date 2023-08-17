/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Virtual keyboard model animation states.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link METAVirtualKeyboard XR_META_virtual_keyboard} extension <b>must</b> be enabled prior to using {@link XrVirtualKeyboardModelAnimationStatesMETA}</li>
 * <li>{@code type} <b>must</b> be {@link METAVirtualKeyboard#XR_TYPE_VIRTUAL_KEYBOARD_MODEL_ANIMATION_STATES_META TYPE_VIRTUAL_KEYBOARD_MODEL_ANIMATION_STATES_META}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * <li>If {@code stateCapacityInput} is not 0, {@code states} <b>must</b> be a pointer to an array of {@code stateCapacityInput} {@link XrVirtualKeyboardAnimationStateMETA} structures</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XrVirtualKeyboardAnimationStateMETA}, {@link METAVirtualKeyboard#xrGetVirtualKeyboardModelAnimationStatesMETA GetVirtualKeyboardModelAnimationStatesMETA}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrVirtualKeyboardModelAnimationStatesMETA {
 *     XrStructureType {@link #type};
 *     void * {@link #next};
 *     uint32_t {@link #stateCapacityInput};
 *     uint32_t {@link #stateCountOutput};
 *     {@link XrVirtualKeyboardAnimationStateMETA XrVirtualKeyboardAnimationStateMETA} * {@link #states};
 * }</code></pre>
 */
public class XrVirtualKeyboardModelAnimationStatesMETA extends Struct<XrVirtualKeyboardModelAnimationStatesMETA> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        STATECAPACITYINPUT,
        STATECOUNTOUTPUT,
        STATES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        STATECAPACITYINPUT = layout.offsetof(2);
        STATECOUNTOUTPUT = layout.offsetof(3);
        STATES = layout.offsetof(4);
    }

    protected XrVirtualKeyboardModelAnimationStatesMETA(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrVirtualKeyboardModelAnimationStatesMETA create(long address, @Nullable ByteBuffer container) {
        return new XrVirtualKeyboardModelAnimationStatesMETA(address, container);
    }

    /**
     * Creates a {@code XrVirtualKeyboardModelAnimationStatesMETA} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrVirtualKeyboardModelAnimationStatesMETA(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the {@code XrStructureType} of this structure. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** {@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension. */
    @NativeType("void *")
    public long next() { return nnext(address()); }
    /** the capacity of the {@code states} array, or 0 to indicate a request to retrieve the required capacity. */
    @NativeType("uint32_t")
    public int stateCapacityInput() { return nstateCapacityInput(address()); }
    /** filled in by the runtime with the count of {@link XrVirtualKeyboardAnimationStateMETA} written or the required capacity in the case that {@code stateCapacityInput} is insufficient. */
    @NativeType("uint32_t")
    public int stateCountOutput() { return nstateCountOutput(address()); }
    /** the array of {@link XrVirtualKeyboardAnimationStateMETA} to apply to the model. */
    @Nullable
    @NativeType("XrVirtualKeyboardAnimationStateMETA *")
    public XrVirtualKeyboardAnimationStateMETA.Buffer states() { return nstates(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrVirtualKeyboardModelAnimationStatesMETA type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link METAVirtualKeyboard#XR_TYPE_VIRTUAL_KEYBOARD_MODEL_ANIMATION_STATES_META TYPE_VIRTUAL_KEYBOARD_MODEL_ANIMATION_STATES_META} value to the {@link #type} field. */
    public XrVirtualKeyboardModelAnimationStatesMETA type$Default() { return type(METAVirtualKeyboard.XR_TYPE_VIRTUAL_KEYBOARD_MODEL_ANIMATION_STATES_META); }
    /** Sets the specified value to the {@link #next} field. */
    public XrVirtualKeyboardModelAnimationStatesMETA next(@NativeType("void *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@link #stateCapacityInput} field. */
    public XrVirtualKeyboardModelAnimationStatesMETA stateCapacityInput(@NativeType("uint32_t") int value) { nstateCapacityInput(address(), value); return this; }
    /** Sets the specified value to the {@link #stateCountOutput} field. */
    public XrVirtualKeyboardModelAnimationStatesMETA stateCountOutput(@NativeType("uint32_t") int value) { nstateCountOutput(address(), value); return this; }
    /** Sets the address of the specified {@link XrVirtualKeyboardAnimationStateMETA.Buffer} to the {@link #states} field. */
    public XrVirtualKeyboardModelAnimationStatesMETA states(@Nullable @NativeType("XrVirtualKeyboardAnimationStateMETA *") XrVirtualKeyboardAnimationStateMETA.Buffer value) { nstates(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrVirtualKeyboardModelAnimationStatesMETA set(
        int type,
        long next,
        int stateCapacityInput,
        int stateCountOutput,
        @Nullable XrVirtualKeyboardAnimationStateMETA.Buffer states
    ) {
        type(type);
        next(next);
        stateCapacityInput(stateCapacityInput);
        stateCountOutput(stateCountOutput);
        states(states);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrVirtualKeyboardModelAnimationStatesMETA set(XrVirtualKeyboardModelAnimationStatesMETA src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrVirtualKeyboardModelAnimationStatesMETA} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrVirtualKeyboardModelAnimationStatesMETA malloc() {
        return new XrVirtualKeyboardModelAnimationStatesMETA(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrVirtualKeyboardModelAnimationStatesMETA} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrVirtualKeyboardModelAnimationStatesMETA calloc() {
        return new XrVirtualKeyboardModelAnimationStatesMETA(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrVirtualKeyboardModelAnimationStatesMETA} instance allocated with {@link BufferUtils}. */
    public static XrVirtualKeyboardModelAnimationStatesMETA create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrVirtualKeyboardModelAnimationStatesMETA(memAddress(container), container);
    }

    /** Returns a new {@code XrVirtualKeyboardModelAnimationStatesMETA} instance for the specified memory address. */
    public static XrVirtualKeyboardModelAnimationStatesMETA create(long address) {
        return new XrVirtualKeyboardModelAnimationStatesMETA(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrVirtualKeyboardModelAnimationStatesMETA createSafe(long address) {
        return address == NULL ? null : new XrVirtualKeyboardModelAnimationStatesMETA(address, null);
    }

    /**
     * Returns a new {@link XrVirtualKeyboardModelAnimationStatesMETA.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrVirtualKeyboardModelAnimationStatesMETA.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrVirtualKeyboardModelAnimationStatesMETA.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrVirtualKeyboardModelAnimationStatesMETA.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrVirtualKeyboardModelAnimationStatesMETA.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrVirtualKeyboardModelAnimationStatesMETA.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrVirtualKeyboardModelAnimationStatesMETA.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrVirtualKeyboardModelAnimationStatesMETA.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrVirtualKeyboardModelAnimationStatesMETA.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrVirtualKeyboardModelAnimationStatesMETA} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrVirtualKeyboardModelAnimationStatesMETA malloc(MemoryStack stack) {
        return new XrVirtualKeyboardModelAnimationStatesMETA(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrVirtualKeyboardModelAnimationStatesMETA} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrVirtualKeyboardModelAnimationStatesMETA calloc(MemoryStack stack) {
        return new XrVirtualKeyboardModelAnimationStatesMETA(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrVirtualKeyboardModelAnimationStatesMETA.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrVirtualKeyboardModelAnimationStatesMETA.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrVirtualKeyboardModelAnimationStatesMETA.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrVirtualKeyboardModelAnimationStatesMETA.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrVirtualKeyboardModelAnimationStatesMETA.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrVirtualKeyboardModelAnimationStatesMETA.NEXT); }
    /** Unsafe version of {@link #stateCapacityInput}. */
    public static int nstateCapacityInput(long struct) { return UNSAFE.getInt(null, struct + XrVirtualKeyboardModelAnimationStatesMETA.STATECAPACITYINPUT); }
    /** Unsafe version of {@link #stateCountOutput}. */
    public static int nstateCountOutput(long struct) { return UNSAFE.getInt(null, struct + XrVirtualKeyboardModelAnimationStatesMETA.STATECOUNTOUTPUT); }
    /** Unsafe version of {@link #states}. */
    @Nullable public static XrVirtualKeyboardAnimationStateMETA.Buffer nstates(long struct) { return XrVirtualKeyboardAnimationStateMETA.createSafe(memGetAddress(struct + XrVirtualKeyboardModelAnimationStatesMETA.STATES), nstateCapacityInput(struct)); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrVirtualKeyboardModelAnimationStatesMETA.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrVirtualKeyboardModelAnimationStatesMETA.NEXT, value); }
    /** Sets the specified value to the {@code stateCapacityInput} field of the specified {@code struct}. */
    public static void nstateCapacityInput(long struct, int value) { UNSAFE.putInt(null, struct + XrVirtualKeyboardModelAnimationStatesMETA.STATECAPACITYINPUT, value); }
    /** Unsafe version of {@link #stateCountOutput(int) stateCountOutput}. */
    public static void nstateCountOutput(long struct, int value) { UNSAFE.putInt(null, struct + XrVirtualKeyboardModelAnimationStatesMETA.STATECOUNTOUTPUT, value); }
    /** Unsafe version of {@link #states(XrVirtualKeyboardAnimationStateMETA.Buffer) states}. */
    public static void nstates(long struct, @Nullable XrVirtualKeyboardAnimationStateMETA.Buffer value) { memPutAddress(struct + XrVirtualKeyboardModelAnimationStatesMETA.STATES, memAddressSafe(value)); if (value != null) { nstateCapacityInput(struct, value.remaining()); } }

    // -----------------------------------

    /** An array of {@link XrVirtualKeyboardModelAnimationStatesMETA} structs. */
    public static class Buffer extends StructBuffer<XrVirtualKeyboardModelAnimationStatesMETA, Buffer> implements NativeResource {

        private static final XrVirtualKeyboardModelAnimationStatesMETA ELEMENT_FACTORY = XrVirtualKeyboardModelAnimationStatesMETA.create(-1L);

        /**
         * Creates a new {@code XrVirtualKeyboardModelAnimationStatesMETA.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrVirtualKeyboardModelAnimationStatesMETA#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrVirtualKeyboardModelAnimationStatesMETA getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrVirtualKeyboardModelAnimationStatesMETA#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrVirtualKeyboardModelAnimationStatesMETA.ntype(address()); }
        /** @return the value of the {@link XrVirtualKeyboardModelAnimationStatesMETA#next} field. */
        @NativeType("void *")
        public long next() { return XrVirtualKeyboardModelAnimationStatesMETA.nnext(address()); }
        /** @return the value of the {@link XrVirtualKeyboardModelAnimationStatesMETA#stateCapacityInput} field. */
        @NativeType("uint32_t")
        public int stateCapacityInput() { return XrVirtualKeyboardModelAnimationStatesMETA.nstateCapacityInput(address()); }
        /** @return the value of the {@link XrVirtualKeyboardModelAnimationStatesMETA#stateCountOutput} field. */
        @NativeType("uint32_t")
        public int stateCountOutput() { return XrVirtualKeyboardModelAnimationStatesMETA.nstateCountOutput(address()); }
        /** @return a {@link XrVirtualKeyboardAnimationStateMETA.Buffer} view of the struct array pointed to by the {@link XrVirtualKeyboardModelAnimationStatesMETA#states} field. */
        @Nullable
        @NativeType("XrVirtualKeyboardAnimationStateMETA *")
        public XrVirtualKeyboardAnimationStateMETA.Buffer states() { return XrVirtualKeyboardModelAnimationStatesMETA.nstates(address()); }

        /** Sets the specified value to the {@link XrVirtualKeyboardModelAnimationStatesMETA#type} field. */
        public XrVirtualKeyboardModelAnimationStatesMETA.Buffer type(@NativeType("XrStructureType") int value) { XrVirtualKeyboardModelAnimationStatesMETA.ntype(address(), value); return this; }
        /** Sets the {@link METAVirtualKeyboard#XR_TYPE_VIRTUAL_KEYBOARD_MODEL_ANIMATION_STATES_META TYPE_VIRTUAL_KEYBOARD_MODEL_ANIMATION_STATES_META} value to the {@link XrVirtualKeyboardModelAnimationStatesMETA#type} field. */
        public XrVirtualKeyboardModelAnimationStatesMETA.Buffer type$Default() { return type(METAVirtualKeyboard.XR_TYPE_VIRTUAL_KEYBOARD_MODEL_ANIMATION_STATES_META); }
        /** Sets the specified value to the {@link XrVirtualKeyboardModelAnimationStatesMETA#next} field. */
        public XrVirtualKeyboardModelAnimationStatesMETA.Buffer next(@NativeType("void *") long value) { XrVirtualKeyboardModelAnimationStatesMETA.nnext(address(), value); return this; }
        /** Sets the specified value to the {@link XrVirtualKeyboardModelAnimationStatesMETA#stateCapacityInput} field. */
        public XrVirtualKeyboardModelAnimationStatesMETA.Buffer stateCapacityInput(@NativeType("uint32_t") int value) { XrVirtualKeyboardModelAnimationStatesMETA.nstateCapacityInput(address(), value); return this; }
        /** Sets the specified value to the {@link XrVirtualKeyboardModelAnimationStatesMETA#stateCountOutput} field. */
        public XrVirtualKeyboardModelAnimationStatesMETA.Buffer stateCountOutput(@NativeType("uint32_t") int value) { XrVirtualKeyboardModelAnimationStatesMETA.nstateCountOutput(address(), value); return this; }
        /** Sets the address of the specified {@link XrVirtualKeyboardAnimationStateMETA.Buffer} to the {@link XrVirtualKeyboardModelAnimationStatesMETA#states} field. */
        public XrVirtualKeyboardModelAnimationStatesMETA.Buffer states(@Nullable @NativeType("XrVirtualKeyboardAnimationStateMETA *") XrVirtualKeyboardAnimationStateMETA.Buffer value) { XrVirtualKeyboardModelAnimationStatesMETA.nstates(address(), value); return this; }

    }

}