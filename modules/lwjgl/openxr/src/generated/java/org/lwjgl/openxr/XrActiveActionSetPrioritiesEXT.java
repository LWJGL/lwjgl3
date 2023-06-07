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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Active action set priority numbers.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link EXTActiveActionSetPriority XR_EXT_active_action_set_priority} extension <b>must</b> be enabled prior to using {@link XrActiveActionSetPrioritiesEXT}</li>
 * <li>{@code type} <b>must</b> be {@link EXTActiveActionSetPriority#XR_TYPE_ACTIVE_ACTION_SET_PRIORITIES_EXT TYPE_ACTIVE_ACTION_SET_PRIORITIES_EXT}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * <li>{@code actionSetPriorities} <b>must</b> be a pointer to an array of {@code actionSetPriorityCount} valid {@link XrActiveActionSetPriorityEXT} structures</li>
 * <li>The {@code actionSetPriorityCount} parameter <b>must</b> be greater than 0</li>
 * </ul>
 * 
 * <p>The runtime <b>must</b> ignore any priority numbers for action sets that were not specified as an active action set in the {@link XrActionsSyncInfo} structure as this would have no effect.</p>
 * 
 * <p>The priority numbers provided in {@link XrActiveActionSetPriorityEXT} <b>must</b> override the priority number of the active action set starting with the {@link XR10#xrSyncActions SyncActions} call it is provided to, until the first subsequent call to {@link XR10#xrSyncActions SyncActions}.</p>
 * 
 * <p>When a subsequent call is made to {@link XR10#xrSyncActions SyncActions} where an active action set does not have a corresponding priority number specified in the {@link XrActiveActionSetPriorityEXT} structure the priority number for that action set <b>must</b> revert back to the priority number provided in {@link XrActionSetCreateInfo} when that action set was created.</p>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XrActionsSyncInfo}, {@link XrActiveActionSetPriorityEXT}, {@link XR10#xrSyncActions SyncActions}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrActiveActionSetPrioritiesEXT {
 *     XrStructureType {@link #type};
 *     void const * {@link #next};
 *     uint32_t actionSetPriorityCount;
 *     {@link XrActiveActionSetPriorityEXT XrActiveActionSetPriorityEXT} const * {@link #actionSetPriorities};
 * }</code></pre>
 */
public class XrActiveActionSetPrioritiesEXT extends Struct<XrActiveActionSetPrioritiesEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        ACTIONSETPRIORITYCOUNT,
        ACTIONSETPRIORITIES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        ACTIONSETPRIORITYCOUNT = layout.offsetof(2);
        ACTIONSETPRIORITIES = layout.offsetof(3);
    }

    protected XrActiveActionSetPrioritiesEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrActiveActionSetPrioritiesEXT create(long address, @Nullable ByteBuffer container) {
        return new XrActiveActionSetPrioritiesEXT(address, container);
    }

    /**
     * Creates a {@code XrActiveActionSetPrioritiesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrActiveActionSetPrioritiesEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the {@code XrStructureType} of this structure. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** {@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension. */
    @NativeType("void const *")
    public long next() { return nnext(address()); }
    /** @return the value of the {@code actionSetPriorityCount} field. */
    @NativeType("uint32_t")
    public int actionSetPriorityCount() { return nactionSetPriorityCount(address()); }
    /** a pointer to an array that maps action sets to their active priority numbers. If an action set is specified multiple times, the runtime <b>may</b> return {@link XR10#XR_ERROR_VALIDATION_FAILURE ERROR_VALIDATION_FAILURE} from {@link XR10#xrSyncActions SyncActions}. */
    @NativeType("XrActiveActionSetPriorityEXT const *")
    public XrActiveActionSetPriorityEXT.Buffer actionSetPriorities() { return nactionSetPriorities(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrActiveActionSetPrioritiesEXT type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link EXTActiveActionSetPriority#XR_TYPE_ACTIVE_ACTION_SET_PRIORITIES_EXT TYPE_ACTIVE_ACTION_SET_PRIORITIES_EXT} value to the {@link #type} field. */
    public XrActiveActionSetPrioritiesEXT type$Default() { return type(EXTActiveActionSetPriority.XR_TYPE_ACTIVE_ACTION_SET_PRIORITIES_EXT); }
    /** Sets the specified value to the {@link #next} field. */
    public XrActiveActionSetPrioritiesEXT next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the address of the specified {@link XrActiveActionSetPriorityEXT.Buffer} to the {@link #actionSetPriorities} field. */
    public XrActiveActionSetPrioritiesEXT actionSetPriorities(@NativeType("XrActiveActionSetPriorityEXT const *") XrActiveActionSetPriorityEXT.Buffer value) { nactionSetPriorities(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrActiveActionSetPrioritiesEXT set(
        int type,
        long next,
        XrActiveActionSetPriorityEXT.Buffer actionSetPriorities
    ) {
        type(type);
        next(next);
        actionSetPriorities(actionSetPriorities);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrActiveActionSetPrioritiesEXT set(XrActiveActionSetPrioritiesEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrActiveActionSetPrioritiesEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrActiveActionSetPrioritiesEXT malloc() {
        return new XrActiveActionSetPrioritiesEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrActiveActionSetPrioritiesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrActiveActionSetPrioritiesEXT calloc() {
        return new XrActiveActionSetPrioritiesEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrActiveActionSetPrioritiesEXT} instance allocated with {@link BufferUtils}. */
    public static XrActiveActionSetPrioritiesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrActiveActionSetPrioritiesEXT(memAddress(container), container);
    }

    /** Returns a new {@code XrActiveActionSetPrioritiesEXT} instance for the specified memory address. */
    public static XrActiveActionSetPrioritiesEXT create(long address) {
        return new XrActiveActionSetPrioritiesEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrActiveActionSetPrioritiesEXT createSafe(long address) {
        return address == NULL ? null : new XrActiveActionSetPrioritiesEXT(address, null);
    }

    /**
     * Returns a new {@link XrActiveActionSetPrioritiesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrActiveActionSetPrioritiesEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrActiveActionSetPrioritiesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrActiveActionSetPrioritiesEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrActiveActionSetPrioritiesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrActiveActionSetPrioritiesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrActiveActionSetPrioritiesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrActiveActionSetPrioritiesEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrActiveActionSetPrioritiesEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrActiveActionSetPrioritiesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrActiveActionSetPrioritiesEXT malloc(MemoryStack stack) {
        return new XrActiveActionSetPrioritiesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrActiveActionSetPrioritiesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrActiveActionSetPrioritiesEXT calloc(MemoryStack stack) {
        return new XrActiveActionSetPrioritiesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrActiveActionSetPrioritiesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrActiveActionSetPrioritiesEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrActiveActionSetPrioritiesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrActiveActionSetPrioritiesEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrActiveActionSetPrioritiesEXT.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrActiveActionSetPrioritiesEXT.NEXT); }
    /** Unsafe version of {@link #actionSetPriorityCount}. */
    public static int nactionSetPriorityCount(long struct) { return UNSAFE.getInt(null, struct + XrActiveActionSetPrioritiesEXT.ACTIONSETPRIORITYCOUNT); }
    /** Unsafe version of {@link #actionSetPriorities}. */
    public static XrActiveActionSetPriorityEXT.Buffer nactionSetPriorities(long struct) { return XrActiveActionSetPriorityEXT.create(memGetAddress(struct + XrActiveActionSetPrioritiesEXT.ACTIONSETPRIORITIES), nactionSetPriorityCount(struct)); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrActiveActionSetPrioritiesEXT.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrActiveActionSetPrioritiesEXT.NEXT, value); }
    /** Sets the specified value to the {@code actionSetPriorityCount} field of the specified {@code struct}. */
    public static void nactionSetPriorityCount(long struct, int value) { UNSAFE.putInt(null, struct + XrActiveActionSetPrioritiesEXT.ACTIONSETPRIORITYCOUNT, value); }
    /** Unsafe version of {@link #actionSetPriorities(XrActiveActionSetPriorityEXT.Buffer) actionSetPriorities}. */
    public static void nactionSetPriorities(long struct, XrActiveActionSetPriorityEXT.Buffer value) { memPutAddress(struct + XrActiveActionSetPrioritiesEXT.ACTIONSETPRIORITIES, value.address()); nactionSetPriorityCount(struct, value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        int actionSetPriorityCount = nactionSetPriorityCount(struct);
        long actionSetPriorities = memGetAddress(struct + XrActiveActionSetPrioritiesEXT.ACTIONSETPRIORITIES);
        check(actionSetPriorities);
        validate(actionSetPriorities, actionSetPriorityCount, XrActiveActionSetPriorityEXT.SIZEOF, XrActiveActionSetPriorityEXT::validate);
    }

    // -----------------------------------

    /** An array of {@link XrActiveActionSetPrioritiesEXT} structs. */
    public static class Buffer extends StructBuffer<XrActiveActionSetPrioritiesEXT, Buffer> implements NativeResource {

        private static final XrActiveActionSetPrioritiesEXT ELEMENT_FACTORY = XrActiveActionSetPrioritiesEXT.create(-1L);

        /**
         * Creates a new {@code XrActiveActionSetPrioritiesEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrActiveActionSetPrioritiesEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrActiveActionSetPrioritiesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrActiveActionSetPrioritiesEXT#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrActiveActionSetPrioritiesEXT.ntype(address()); }
        /** @return the value of the {@link XrActiveActionSetPrioritiesEXT#next} field. */
        @NativeType("void const *")
        public long next() { return XrActiveActionSetPrioritiesEXT.nnext(address()); }
        /** @return the value of the {@code actionSetPriorityCount} field. */
        @NativeType("uint32_t")
        public int actionSetPriorityCount() { return XrActiveActionSetPrioritiesEXT.nactionSetPriorityCount(address()); }
        /** @return a {@link XrActiveActionSetPriorityEXT.Buffer} view of the struct array pointed to by the {@link XrActiveActionSetPrioritiesEXT#actionSetPriorities} field. */
        @NativeType("XrActiveActionSetPriorityEXT const *")
        public XrActiveActionSetPriorityEXT.Buffer actionSetPriorities() { return XrActiveActionSetPrioritiesEXT.nactionSetPriorities(address()); }

        /** Sets the specified value to the {@link XrActiveActionSetPrioritiesEXT#type} field. */
        public XrActiveActionSetPrioritiesEXT.Buffer type(@NativeType("XrStructureType") int value) { XrActiveActionSetPrioritiesEXT.ntype(address(), value); return this; }
        /** Sets the {@link EXTActiveActionSetPriority#XR_TYPE_ACTIVE_ACTION_SET_PRIORITIES_EXT TYPE_ACTIVE_ACTION_SET_PRIORITIES_EXT} value to the {@link XrActiveActionSetPrioritiesEXT#type} field. */
        public XrActiveActionSetPrioritiesEXT.Buffer type$Default() { return type(EXTActiveActionSetPriority.XR_TYPE_ACTIVE_ACTION_SET_PRIORITIES_EXT); }
        /** Sets the specified value to the {@link XrActiveActionSetPrioritiesEXT#next} field. */
        public XrActiveActionSetPrioritiesEXT.Buffer next(@NativeType("void const *") long value) { XrActiveActionSetPrioritiesEXT.nnext(address(), value); return this; }
        /** Sets the address of the specified {@link XrActiveActionSetPriorityEXT.Buffer} to the {@link XrActiveActionSetPrioritiesEXT#actionSetPriorities} field. */
        public XrActiveActionSetPrioritiesEXT.Buffer actionSetPriorities(@NativeType("XrActiveActionSetPriorityEXT const *") XrActiveActionSetPriorityEXT.Buffer value) { XrActiveActionSetPrioritiesEXT.nactionSetPriorities(address(), value); return this; }

    }

}