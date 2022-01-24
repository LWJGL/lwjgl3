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

import static org.lwjgl.openxr.XR10.*;

/**
 * XrActionSet creation info.
 * 
 * <h5>Description</h5>
 * 
 * <p>When multiple actions are bound to the same input source, the {@code priority} of each action set determines which bindings are suppressed. Runtimes <b>must</b> ignore input sources from action sets with a lower priority number if those specific input sources are also present in active actions within a higher priority action set. If multiple action sets with the same priority are bound to the same input source and that is the highest priority number, runtimes <b>must</b> process all those bindings at the same time.</p>
 * 
 * <p>Two actions are considered to be bound to the same input source if they use the same <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#semantic-path-input">identifier and optional location</a> path segments, even if they have different component segments.</p>
 * 
 * <p>When runtimes are ignoring bindings because of priority, they <b>must</b> treat the binding to that input source as though they do not exist. That means the {@code isActive} field <b>must</b> be {@link XR10#XR_FALSE FALSE} when retrieving action data, and that the runtime <b>must</b> not provide any visual, haptic, or other feedback related to the binding of that action to that input source. Other actions in the same action set which are bound to input sources that do not collide are not affected and are processed as normal.</p>
 * 
 * <p>If {@code actionSetName} or {@code localizedActionSetName} are empty strings, the runtime <b>must</b> return {@link XR10#XR_ERROR_NAME_INVALID ERROR_NAME_INVALID} or {@link XR10#XR_ERROR_LOCALIZED_NAME_INVALID ERROR_LOCALIZED_NAME_INVALID} respectively. If {@code actionSetName} or {@code localizedActionSetName} are duplicates of the corresponding field for any existing action set in the specified instance, the runtime <b>must</b> return {@link XR10#XR_ERROR_NAME_DUPLICATED ERROR_NAME_DUPLICATED} or {@link XR10#XR_ERROR_LOCALIZED_NAME_DUPLICATED ERROR_LOCALIZED_NAME_DUPLICATED} respectively. If the conflicting action set is destroyed, the conflicting field is no longer considered duplicated. If {@code actionSetName} contains characters which are not allowed in a single level of a <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#well-formed-path-strings">well-formed path string</a>, the runtime <b>must</b> return {@link XR10#XR_ERROR_PATH_FORMAT_INVALID ERROR_PATH_FORMAT_INVALID}.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code type} <b>must</b> be {@link XR10#XR_TYPE_ACTION_SET_CREATE_INFO TYPE_ACTION_SET_CREATE_INFO}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * <li>{@code actionSetName} <b>must</b> be a null-terminated UTF-8 string whose length is less than or equal to {@link XR10#XR_MAX_ACTION_SET_NAME_SIZE MAX_ACTION_SET_NAME_SIZE}</li>
 * <li>{@code localizedActionSetName} <b>must</b> be a null-terminated UTF-8 string whose length is less than or equal to {@link XR10#XR_MAX_LOCALIZED_ACTION_SET_NAME_SIZE MAX_LOCALIZED_ACTION_SET_NAME_SIZE}</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XR10#xrCreateActionSet CreateActionSet}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrActionSetCreateInfo {
 *     XrStructureType {@link #type};
 *     void const * {@link #next};
 *     char {@link #actionSetName}[XR_MAX_ACTION_SET_NAME_SIZE];
 *     char {@link #localizedActionSetName}[XR_MAX_LOCALIZED_ACTION_SET_NAME_SIZE];
 *     uint32_t {@link #priority};
 * }</code></pre>
 */
public class XrActionSetCreateInfo extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        ACTIONSETNAME,
        LOCALIZEDACTIONSETNAME,
        PRIORITY;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __array(1, XR_MAX_ACTION_SET_NAME_SIZE),
            __array(1, XR_MAX_LOCALIZED_ACTION_SET_NAME_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        ACTIONSETNAME = layout.offsetof(2);
        LOCALIZEDACTIONSETNAME = layout.offsetof(3);
        PRIORITY = layout.offsetof(4);
    }

    /**
     * Creates a {@code XrActionSetCreateInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrActionSetCreateInfo(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the {@code XrStructureType} of this structure. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** {@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR. */
    @NativeType("void const *")
    public long next() { return nnext(address()); }
    /** an array containing a {@code NULL} terminated non-empty string with the name of this action set. */
    @NativeType("char[XR_MAX_ACTION_SET_NAME_SIZE]")
    public ByteBuffer actionSetName() { return nactionSetName(address()); }
    /** an array containing a {@code NULL} terminated non-empty string with the name of this action set. */
    @NativeType("char[XR_MAX_ACTION_SET_NAME_SIZE]")
    public String actionSetNameString() { return nactionSetNameString(address()); }
    /** an array containing a {@code NULL} terminated {@code UTF}-8 string that can be presented to the user as a description of the action set. This string should be presented in the system’s current active locale. */
    @NativeType("char[XR_MAX_LOCALIZED_ACTION_SET_NAME_SIZE]")
    public ByteBuffer localizedActionSetName() { return nlocalizedActionSetName(address()); }
    /** an array containing a {@code NULL} terminated {@code UTF}-8 string that can be presented to the user as a description of the action set. This string should be presented in the system’s current active locale. */
    @NativeType("char[XR_MAX_LOCALIZED_ACTION_SET_NAME_SIZE]")
    public String localizedActionSetNameString() { return nlocalizedActionSetNameString(address()); }
    /** defines which action sets' actions are active on a given input source when actions on multiple active action sets are bound to the same input source. Larger priority numbers take precedence over smaller priority numbers. */
    @NativeType("uint32_t")
    public int priority() { return npriority(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrActionSetCreateInfo type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link XR10#XR_TYPE_ACTION_SET_CREATE_INFO TYPE_ACTION_SET_CREATE_INFO} value to the {@link #type} field. */
    public XrActionSetCreateInfo type$Default() { return type(XR10.XR_TYPE_ACTION_SET_CREATE_INFO); }
    /** Sets the specified value to the {@link #next} field. */
    public XrActionSetCreateInfo next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Copies the specified encoded string to the {@link #actionSetName} field. */
    public XrActionSetCreateInfo actionSetName(@NativeType("char[XR_MAX_ACTION_SET_NAME_SIZE]") ByteBuffer value) { nactionSetName(address(), value); return this; }
    /** Copies the specified encoded string to the {@link #localizedActionSetName} field. */
    public XrActionSetCreateInfo localizedActionSetName(@NativeType("char[XR_MAX_LOCALIZED_ACTION_SET_NAME_SIZE]") ByteBuffer value) { nlocalizedActionSetName(address(), value); return this; }
    /** Sets the specified value to the {@link #priority} field. */
    public XrActionSetCreateInfo priority(@NativeType("uint32_t") int value) { npriority(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrActionSetCreateInfo set(
        int type,
        long next,
        ByteBuffer actionSetName,
        ByteBuffer localizedActionSetName,
        int priority
    ) {
        type(type);
        next(next);
        actionSetName(actionSetName);
        localizedActionSetName(localizedActionSetName);
        priority(priority);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrActionSetCreateInfo set(XrActionSetCreateInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrActionSetCreateInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrActionSetCreateInfo malloc() {
        return wrap(XrActionSetCreateInfo.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XrActionSetCreateInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrActionSetCreateInfo calloc() {
        return wrap(XrActionSetCreateInfo.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XrActionSetCreateInfo} instance allocated with {@link BufferUtils}. */
    public static XrActionSetCreateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XrActionSetCreateInfo.class, memAddress(container), container);
    }

    /** Returns a new {@code XrActionSetCreateInfo} instance for the specified memory address. */
    public static XrActionSetCreateInfo create(long address) {
        return wrap(XrActionSetCreateInfo.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrActionSetCreateInfo createSafe(long address) {
        return address == NULL ? null : wrap(XrActionSetCreateInfo.class, address);
    }

    /**
     * Returns a new {@link XrActionSetCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrActionSetCreateInfo.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrActionSetCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrActionSetCreateInfo.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrActionSetCreateInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrActionSetCreateInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XrActionSetCreateInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrActionSetCreateInfo.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrActionSetCreateInfo.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code XrActionSetCreateInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrActionSetCreateInfo malloc(MemoryStack stack) {
        return wrap(XrActionSetCreateInfo.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XrActionSetCreateInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrActionSetCreateInfo calloc(MemoryStack stack) {
        return wrap(XrActionSetCreateInfo.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XrActionSetCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrActionSetCreateInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrActionSetCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrActionSetCreateInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrActionSetCreateInfo.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrActionSetCreateInfo.NEXT); }
    /** Unsafe version of {@link #actionSetName}. */
    public static ByteBuffer nactionSetName(long struct) { return memByteBuffer(struct + XrActionSetCreateInfo.ACTIONSETNAME, XR_MAX_ACTION_SET_NAME_SIZE); }
    /** Unsafe version of {@link #actionSetNameString}. */
    public static String nactionSetNameString(long struct) { return memUTF8(struct + XrActionSetCreateInfo.ACTIONSETNAME); }
    /** Unsafe version of {@link #localizedActionSetName}. */
    public static ByteBuffer nlocalizedActionSetName(long struct) { return memByteBuffer(struct + XrActionSetCreateInfo.LOCALIZEDACTIONSETNAME, XR_MAX_LOCALIZED_ACTION_SET_NAME_SIZE); }
    /** Unsafe version of {@link #localizedActionSetNameString}. */
    public static String nlocalizedActionSetNameString(long struct) { return memUTF8(struct + XrActionSetCreateInfo.LOCALIZEDACTIONSETNAME); }
    /** Unsafe version of {@link #priority}. */
    public static int npriority(long struct) { return UNSAFE.getInt(null, struct + XrActionSetCreateInfo.PRIORITY); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrActionSetCreateInfo.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrActionSetCreateInfo.NEXT, value); }
    /** Unsafe version of {@link #actionSetName(ByteBuffer) actionSetName}. */
    public static void nactionSetName(long struct, ByteBuffer value) {
        if (CHECKS) {
            checkNT1(value);
            checkGT(value, XR_MAX_ACTION_SET_NAME_SIZE);
        }
        memCopy(memAddress(value), struct + XrActionSetCreateInfo.ACTIONSETNAME, value.remaining());
    }
    /** Unsafe version of {@link #localizedActionSetName(ByteBuffer) localizedActionSetName}. */
    public static void nlocalizedActionSetName(long struct, ByteBuffer value) {
        if (CHECKS) {
            checkNT1(value);
            checkGT(value, XR_MAX_LOCALIZED_ACTION_SET_NAME_SIZE);
        }
        memCopy(memAddress(value), struct + XrActionSetCreateInfo.LOCALIZEDACTIONSETNAME, value.remaining());
    }
    /** Unsafe version of {@link #priority(int) priority}. */
    public static void npriority(long struct, int value) { UNSAFE.putInt(null, struct + XrActionSetCreateInfo.PRIORITY, value); }

    // -----------------------------------

    /** An array of {@link XrActionSetCreateInfo} structs. */
    public static class Buffer extends StructBuffer<XrActionSetCreateInfo, Buffer> implements NativeResource {

        private static final XrActionSetCreateInfo ELEMENT_FACTORY = XrActionSetCreateInfo.create(-1L);

        /**
         * Creates a new {@code XrActionSetCreateInfo.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrActionSetCreateInfo#SIZEOF}, and its mark will be undefined.
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
        protected XrActionSetCreateInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrActionSetCreateInfo#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrActionSetCreateInfo.ntype(address()); }
        /** @return the value of the {@link XrActionSetCreateInfo#next} field. */
        @NativeType("void const *")
        public long next() { return XrActionSetCreateInfo.nnext(address()); }
        /** @return a {@link ByteBuffer} view of the {@link XrActionSetCreateInfo#actionSetName} field. */
        @NativeType("char[XR_MAX_ACTION_SET_NAME_SIZE]")
        public ByteBuffer actionSetName() { return XrActionSetCreateInfo.nactionSetName(address()); }
        /** @return the null-terminated string stored in the {@link XrActionSetCreateInfo#actionSetName} field. */
        @NativeType("char[XR_MAX_ACTION_SET_NAME_SIZE]")
        public String actionSetNameString() { return XrActionSetCreateInfo.nactionSetNameString(address()); }
        /** @return a {@link ByteBuffer} view of the {@link XrActionSetCreateInfo#localizedActionSetName} field. */
        @NativeType("char[XR_MAX_LOCALIZED_ACTION_SET_NAME_SIZE]")
        public ByteBuffer localizedActionSetName() { return XrActionSetCreateInfo.nlocalizedActionSetName(address()); }
        /** @return the null-terminated string stored in the {@link XrActionSetCreateInfo#localizedActionSetName} field. */
        @NativeType("char[XR_MAX_LOCALIZED_ACTION_SET_NAME_SIZE]")
        public String localizedActionSetNameString() { return XrActionSetCreateInfo.nlocalizedActionSetNameString(address()); }
        /** @return the value of the {@link XrActionSetCreateInfo#priority} field. */
        @NativeType("uint32_t")
        public int priority() { return XrActionSetCreateInfo.npriority(address()); }

        /** Sets the specified value to the {@link XrActionSetCreateInfo#type} field. */
        public XrActionSetCreateInfo.Buffer type(@NativeType("XrStructureType") int value) { XrActionSetCreateInfo.ntype(address(), value); return this; }
        /** Sets the {@link XR10#XR_TYPE_ACTION_SET_CREATE_INFO TYPE_ACTION_SET_CREATE_INFO} value to the {@link XrActionSetCreateInfo#type} field. */
        public XrActionSetCreateInfo.Buffer type$Default() { return type(XR10.XR_TYPE_ACTION_SET_CREATE_INFO); }
        /** Sets the specified value to the {@link XrActionSetCreateInfo#next} field. */
        public XrActionSetCreateInfo.Buffer next(@NativeType("void const *") long value) { XrActionSetCreateInfo.nnext(address(), value); return this; }
        /** Copies the specified encoded string to the {@link XrActionSetCreateInfo#actionSetName} field. */
        public XrActionSetCreateInfo.Buffer actionSetName(@NativeType("char[XR_MAX_ACTION_SET_NAME_SIZE]") ByteBuffer value) { XrActionSetCreateInfo.nactionSetName(address(), value); return this; }
        /** Copies the specified encoded string to the {@link XrActionSetCreateInfo#localizedActionSetName} field. */
        public XrActionSetCreateInfo.Buffer localizedActionSetName(@NativeType("char[XR_MAX_LOCALIZED_ACTION_SET_NAME_SIZE]") ByteBuffer value) { XrActionSetCreateInfo.nlocalizedActionSetName(address(), value); return this; }
        /** Sets the specified value to the {@link XrActionSetCreateInfo#priority} field. */
        public XrActionSetCreateInfo.Buffer priority(@NativeType("uint32_t") int value) { XrActionSetCreateInfo.npriority(address(), value); return this; }

    }

}