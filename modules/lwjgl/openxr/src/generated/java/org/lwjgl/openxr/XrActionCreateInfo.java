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
 * XrAction creation info.
 * 
 * <h5>Description</h5>
 * 
 * <p>Subaction paths are a mechanism that enables applications to use the same action name and handle on multiple devices. Applications can query action state using subaction paths that differentiate data coming from each device. This allows the runtime to group logically equivalent actions together in system UI. For instance, an application could create a single actionname:pick_up action with the pathname:/user/hand/left and pathname:/user/hand/right subaction paths and use the subaction paths to independently query the state of actionname:pick_up_with_left_hand and actionname:pick_up_with_right_hand.</p>
 * 
 * <p>Applications <b>can</b> create actions with or without the {@code subactionPaths} set to a list of paths. If this list of paths is omitted (i.e. {@code subactionPaths} is set to {@code NULL}, and {@code countSubactionPaths} is set to 0), the application is opting out of filtering action results by subaction paths and any call to get action data must also omit subaction paths.</p>
 * 
 * <p>If {@code subactionPaths} is specified and any of the following conditions are not satisfied, the runtime <b>must</b> return {@link XR10#XR_ERROR_PATH_UNSUPPORTED ERROR_PATH_UNSUPPORTED}:</p>
 * 
 * <ul>
 * <li>Each path provided is one of:
 * 
 * <ul>
 * <li>pathname:/user/head</li>
 * <li>pathname:/user/hand/left</li>
 * <li>pathname:/user/hand/right</li>
 * <li>pathname:/user/gamepad</li>
 * </ul>
 * </li>
 * <li>No path appears in the list more than once</li>
 * </ul>
 * 
 * <p>Extensions <b>may</b> append additional top level user paths to the above list.</p>
 * 
 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
 * 
 * <p>Earlier revisions of the spec mentioned pathname:/user but it could not be implemented as specified and was removed as errata.</p>
 * </div>
 * 
 * <p>The runtime <b>must</b> return {@link XR10#XR_ERROR_PATH_UNSUPPORTED ERROR_PATH_UNSUPPORTED} in the following circumstances:</p>
 * 
 * <ul>
 * <li>The application specified subaction paths at action creation and the application called {@code xrGetActionState*} or a haptic function with an empty subaction path array.</li>
 * <li>The application called {@code xrGetActionState*} or a haptic function with a subaction path that was not specified when the action was created.</li>
 * </ul>
 * 
 * <p>If {@code actionName} or {@code localizedActionName} are empty strings, the runtime <b>must</b> return {@link XR10#XR_ERROR_NAME_INVALID ERROR_NAME_INVALID} or {@link XR10#XR_ERROR_LOCALIZED_NAME_INVALID ERROR_LOCALIZED_NAME_INVALID} respectively. If {@code actionName} or {@code localizedActionName} are duplicates of the corresponding field for any existing action in the specified action set, the runtime <b>must</b> return {@link XR10#XR_ERROR_NAME_DUPLICATED ERROR_NAME_DUPLICATED} or {@link XR10#XR_ERROR_LOCALIZED_NAME_DUPLICATED ERROR_LOCALIZED_NAME_DUPLICATED} respectively. If the conflicting action is destroyed, the conflicting field is no longer considered duplicated. If {@code actionName} contains characters which are not allowed in a single level of a <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#well-formed-path-strings">well-formed path string</a>, the runtime <b>must</b> return {@link XR10#XR_ERROR_PATH_FORMAT_INVALID ERROR_PATH_FORMAT_INVALID}.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code type} <b>must</b> be {@link XR10#XR_TYPE_ACTION_CREATE_INFO TYPE_ACTION_CREATE_INFO}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * <li>{@code actionName} <b>must</b> be a null-terminated UTF-8 string whose length is less than or equal to {@link XR10#XR_MAX_ACTION_NAME_SIZE MAX_ACTION_NAME_SIZE}</li>
 * <li>{@code actionType} <b>must</b> be a valid {@code XrActionType} value</li>
 * <li>If {@code countSubactionPaths} is not 0, {@code subactionPaths} <b>must</b> be a pointer to an array of {@code countSubactionPaths} valid {@code XrPath} values</li>
 * <li>{@code localizedActionName} <b>must</b> be a null-terminated UTF-8 string whose length is less than or equal to {@link XR10#XR_MAX_LOCALIZED_ACTION_NAME_SIZE MAX_LOCALIZED_ACTION_NAME_SIZE}</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XR10#xrCreateAction CreateAction}, {@link XR10#xrCreateActionSet CreateActionSet}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrActionCreateInfo {
 *     XrStructureType {@link #type};
 *     void const * {@link #next};
 *     char {@link #actionName}[XR_MAX_ACTION_NAME_SIZE];
 *     XrActionType {@link #actionType};
 *     uint32_t {@link #countSubactionPaths};
 *     XrPath const * {@link #subactionPaths};
 *     char {@link #localizedActionName}[XR_MAX_LOCALIZED_ACTION_NAME_SIZE];
 * }</code></pre>
 */
public class XrActionCreateInfo extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        ACTIONNAME,
        ACTIONTYPE,
        COUNTSUBACTIONPATHS,
        SUBACTIONPATHS,
        LOCALIZEDACTIONNAME;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __array(1, XR_MAX_ACTION_NAME_SIZE),
            __member(4),
            __member(4),
            __member(POINTER_SIZE),
            __array(1, XR_MAX_LOCALIZED_ACTION_NAME_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        ACTIONNAME = layout.offsetof(2);
        ACTIONTYPE = layout.offsetof(3);
        COUNTSUBACTIONPATHS = layout.offsetof(4);
        SUBACTIONPATHS = layout.offsetof(5);
        LOCALIZEDACTIONNAME = layout.offsetof(6);
    }

    /**
     * Creates a {@code XrActionCreateInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrActionCreateInfo(ByteBuffer container) {
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
    /** an array containing a {@code NULL} terminated string with the name of this action. */
    @NativeType("char[XR_MAX_ACTION_NAME_SIZE]")
    public ByteBuffer actionName() { return nactionName(address()); }
    /** an array containing a {@code NULL} terminated string with the name of this action. */
    @NativeType("char[XR_MAX_ACTION_NAME_SIZE]")
    public String actionNameString() { return nactionNameString(address()); }
    /** the {@code XrActionType} of the action to be created. */
    @NativeType("XrActionType")
    public int actionType() { return nactionType(address()); }
    /** the number of elements in the {@code subactionPaths} array. If {@code subactionPaths} is NULL, this parameter must be 0. */
    @NativeType("uint32_t")
    public int countSubactionPaths() { return ncountSubactionPaths(address()); }
    /** an array of {@code XrPath} or {@code NULL}. If this array is specified, it contains one or more subaction paths that the application intends to query action state for. */
    @Nullable
    @NativeType("XrPath const *")
    public LongBuffer subactionPaths() { return nsubactionPaths(address()); }
    /** an array containing a {@code NULL} terminated {@code UTF}-8 string that can be presented to the user as a description of the action. This string should be in the system’s current active locale. */
    @NativeType("char[XR_MAX_LOCALIZED_ACTION_NAME_SIZE]")
    public ByteBuffer localizedActionName() { return nlocalizedActionName(address()); }
    /** an array containing a {@code NULL} terminated {@code UTF}-8 string that can be presented to the user as a description of the action. This string should be in the system’s current active locale. */
    @NativeType("char[XR_MAX_LOCALIZED_ACTION_NAME_SIZE]")
    public String localizedActionNameString() { return nlocalizedActionNameString(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrActionCreateInfo type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link XR10#XR_TYPE_ACTION_CREATE_INFO TYPE_ACTION_CREATE_INFO} value to the {@link #type} field. */
    public XrActionCreateInfo type$Default() { return type(XR10.XR_TYPE_ACTION_CREATE_INFO); }
    /** Sets the specified value to the {@link #next} field. */
    public XrActionCreateInfo next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Copies the specified encoded string to the {@link #actionName} field. */
    public XrActionCreateInfo actionName(@NativeType("char[XR_MAX_ACTION_NAME_SIZE]") ByteBuffer value) { nactionName(address(), value); return this; }
    /** Sets the specified value to the {@link #actionType} field. */
    public XrActionCreateInfo actionType(@NativeType("XrActionType") int value) { nactionType(address(), value); return this; }
    /** Sets the specified value to the {@link #countSubactionPaths} field. */
    public XrActionCreateInfo countSubactionPaths(@NativeType("uint32_t") int value) { ncountSubactionPaths(address(), value); return this; }
    /** Sets the address of the specified {@link LongBuffer} to the {@link #subactionPaths} field. */
    public XrActionCreateInfo subactionPaths(@Nullable @NativeType("XrPath const *") LongBuffer value) { nsubactionPaths(address(), value); return this; }
    /** Copies the specified encoded string to the {@link #localizedActionName} field. */
    public XrActionCreateInfo localizedActionName(@NativeType("char[XR_MAX_LOCALIZED_ACTION_NAME_SIZE]") ByteBuffer value) { nlocalizedActionName(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrActionCreateInfo set(
        int type,
        long next,
        ByteBuffer actionName,
        int actionType,
        int countSubactionPaths,
        @Nullable LongBuffer subactionPaths,
        ByteBuffer localizedActionName
    ) {
        type(type);
        next(next);
        actionName(actionName);
        actionType(actionType);
        countSubactionPaths(countSubactionPaths);
        subactionPaths(subactionPaths);
        localizedActionName(localizedActionName);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrActionCreateInfo set(XrActionCreateInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrActionCreateInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrActionCreateInfo malloc() {
        return wrap(XrActionCreateInfo.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XrActionCreateInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrActionCreateInfo calloc() {
        return wrap(XrActionCreateInfo.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XrActionCreateInfo} instance allocated with {@link BufferUtils}. */
    public static XrActionCreateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XrActionCreateInfo.class, memAddress(container), container);
    }

    /** Returns a new {@code XrActionCreateInfo} instance for the specified memory address. */
    public static XrActionCreateInfo create(long address) {
        return wrap(XrActionCreateInfo.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrActionCreateInfo createSafe(long address) {
        return address == NULL ? null : wrap(XrActionCreateInfo.class, address);
    }

    /**
     * Returns a new {@link XrActionCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrActionCreateInfo.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrActionCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrActionCreateInfo.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrActionCreateInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrActionCreateInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XrActionCreateInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrActionCreateInfo.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrActionCreateInfo.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code XrActionCreateInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrActionCreateInfo malloc(MemoryStack stack) {
        return wrap(XrActionCreateInfo.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XrActionCreateInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrActionCreateInfo calloc(MemoryStack stack) {
        return wrap(XrActionCreateInfo.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XrActionCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrActionCreateInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrActionCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrActionCreateInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrActionCreateInfo.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrActionCreateInfo.NEXT); }
    /** Unsafe version of {@link #actionName}. */
    public static ByteBuffer nactionName(long struct) { return memByteBuffer(struct + XrActionCreateInfo.ACTIONNAME, XR_MAX_ACTION_NAME_SIZE); }
    /** Unsafe version of {@link #actionNameString}. */
    public static String nactionNameString(long struct) { return memUTF8(struct + XrActionCreateInfo.ACTIONNAME); }
    /** Unsafe version of {@link #actionType}. */
    public static int nactionType(long struct) { return UNSAFE.getInt(null, struct + XrActionCreateInfo.ACTIONTYPE); }
    /** Unsafe version of {@link #countSubactionPaths}. */
    public static int ncountSubactionPaths(long struct) { return UNSAFE.getInt(null, struct + XrActionCreateInfo.COUNTSUBACTIONPATHS); }
    /** Unsafe version of {@link #subactionPaths() subactionPaths}. */
    @Nullable public static LongBuffer nsubactionPaths(long struct) { return memLongBufferSafe(memGetAddress(struct + XrActionCreateInfo.SUBACTIONPATHS), ncountSubactionPaths(struct)); }
    /** Unsafe version of {@link #localizedActionName}. */
    public static ByteBuffer nlocalizedActionName(long struct) { return memByteBuffer(struct + XrActionCreateInfo.LOCALIZEDACTIONNAME, XR_MAX_LOCALIZED_ACTION_NAME_SIZE); }
    /** Unsafe version of {@link #localizedActionNameString}. */
    public static String nlocalizedActionNameString(long struct) { return memUTF8(struct + XrActionCreateInfo.LOCALIZEDACTIONNAME); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrActionCreateInfo.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrActionCreateInfo.NEXT, value); }
    /** Unsafe version of {@link #actionName(ByteBuffer) actionName}. */
    public static void nactionName(long struct, ByteBuffer value) {
        if (CHECKS) {
            checkNT1(value);
            checkGT(value, XR_MAX_ACTION_NAME_SIZE);
        }
        memCopy(memAddress(value), struct + XrActionCreateInfo.ACTIONNAME, value.remaining());
    }
    /** Unsafe version of {@link #actionType(int) actionType}. */
    public static void nactionType(long struct, int value) { UNSAFE.putInt(null, struct + XrActionCreateInfo.ACTIONTYPE, value); }
    /** Sets the specified value to the {@code countSubactionPaths} field of the specified {@code struct}. */
    public static void ncountSubactionPaths(long struct, int value) { UNSAFE.putInt(null, struct + XrActionCreateInfo.COUNTSUBACTIONPATHS, value); }
    /** Unsafe version of {@link #subactionPaths(LongBuffer) subactionPaths}. */
    public static void nsubactionPaths(long struct, @Nullable LongBuffer value) { memPutAddress(struct + XrActionCreateInfo.SUBACTIONPATHS, memAddressSafe(value)); if (value != null) { ncountSubactionPaths(struct, value.remaining()); } }
    /** Unsafe version of {@link #localizedActionName(ByteBuffer) localizedActionName}. */
    public static void nlocalizedActionName(long struct, ByteBuffer value) {
        if (CHECKS) {
            checkNT1(value);
            checkGT(value, XR_MAX_LOCALIZED_ACTION_NAME_SIZE);
        }
        memCopy(memAddress(value), struct + XrActionCreateInfo.LOCALIZEDACTIONNAME, value.remaining());
    }

    // -----------------------------------

    /** An array of {@link XrActionCreateInfo} structs. */
    public static class Buffer extends StructBuffer<XrActionCreateInfo, Buffer> implements NativeResource {

        private static final XrActionCreateInfo ELEMENT_FACTORY = XrActionCreateInfo.create(-1L);

        /**
         * Creates a new {@code XrActionCreateInfo.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrActionCreateInfo#SIZEOF}, and its mark will be undefined.
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
        protected XrActionCreateInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrActionCreateInfo#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrActionCreateInfo.ntype(address()); }
        /** @return the value of the {@link XrActionCreateInfo#next} field. */
        @NativeType("void const *")
        public long next() { return XrActionCreateInfo.nnext(address()); }
        /** @return a {@link ByteBuffer} view of the {@link XrActionCreateInfo#actionName} field. */
        @NativeType("char[XR_MAX_ACTION_NAME_SIZE]")
        public ByteBuffer actionName() { return XrActionCreateInfo.nactionName(address()); }
        /** @return the null-terminated string stored in the {@link XrActionCreateInfo#actionName} field. */
        @NativeType("char[XR_MAX_ACTION_NAME_SIZE]")
        public String actionNameString() { return XrActionCreateInfo.nactionNameString(address()); }
        /** @return the value of the {@link XrActionCreateInfo#actionType} field. */
        @NativeType("XrActionType")
        public int actionType() { return XrActionCreateInfo.nactionType(address()); }
        /** @return the value of the {@link XrActionCreateInfo#countSubactionPaths} field. */
        @NativeType("uint32_t")
        public int countSubactionPaths() { return XrActionCreateInfo.ncountSubactionPaths(address()); }
        /** @return a {@link LongBuffer} view of the data pointed to by the {@link XrActionCreateInfo#subactionPaths} field. */
        @Nullable
        @NativeType("XrPath const *")
        public LongBuffer subactionPaths() { return XrActionCreateInfo.nsubactionPaths(address()); }
        /** @return a {@link ByteBuffer} view of the {@link XrActionCreateInfo#localizedActionName} field. */
        @NativeType("char[XR_MAX_LOCALIZED_ACTION_NAME_SIZE]")
        public ByteBuffer localizedActionName() { return XrActionCreateInfo.nlocalizedActionName(address()); }
        /** @return the null-terminated string stored in the {@link XrActionCreateInfo#localizedActionName} field. */
        @NativeType("char[XR_MAX_LOCALIZED_ACTION_NAME_SIZE]")
        public String localizedActionNameString() { return XrActionCreateInfo.nlocalizedActionNameString(address()); }

        /** Sets the specified value to the {@link XrActionCreateInfo#type} field. */
        public XrActionCreateInfo.Buffer type(@NativeType("XrStructureType") int value) { XrActionCreateInfo.ntype(address(), value); return this; }
        /** Sets the {@link XR10#XR_TYPE_ACTION_CREATE_INFO TYPE_ACTION_CREATE_INFO} value to the {@link XrActionCreateInfo#type} field. */
        public XrActionCreateInfo.Buffer type$Default() { return type(XR10.XR_TYPE_ACTION_CREATE_INFO); }
        /** Sets the specified value to the {@link XrActionCreateInfo#next} field. */
        public XrActionCreateInfo.Buffer next(@NativeType("void const *") long value) { XrActionCreateInfo.nnext(address(), value); return this; }
        /** Copies the specified encoded string to the {@link XrActionCreateInfo#actionName} field. */
        public XrActionCreateInfo.Buffer actionName(@NativeType("char[XR_MAX_ACTION_NAME_SIZE]") ByteBuffer value) { XrActionCreateInfo.nactionName(address(), value); return this; }
        /** Sets the specified value to the {@link XrActionCreateInfo#actionType} field. */
        public XrActionCreateInfo.Buffer actionType(@NativeType("XrActionType") int value) { XrActionCreateInfo.nactionType(address(), value); return this; }
        /** Sets the specified value to the {@link XrActionCreateInfo#countSubactionPaths} field. */
        public XrActionCreateInfo.Buffer countSubactionPaths(@NativeType("uint32_t") int value) { XrActionCreateInfo.ncountSubactionPaths(address(), value); return this; }
        /** Sets the address of the specified {@link LongBuffer} to the {@link XrActionCreateInfo#subactionPaths} field. */
        public XrActionCreateInfo.Buffer subactionPaths(@Nullable @NativeType("XrPath const *") LongBuffer value) { XrActionCreateInfo.nsubactionPaths(address(), value); return this; }
        /** Copies the specified encoded string to the {@link XrActionCreateInfo#localizedActionName} field. */
        public XrActionCreateInfo.Buffer localizedActionName(@NativeType("char[XR_MAX_LOCALIZED_ACTION_NAME_SIZE]") ByteBuffer value) { XrActionCreateInfo.nlocalizedActionName(address(), value); return this; }

    }

}