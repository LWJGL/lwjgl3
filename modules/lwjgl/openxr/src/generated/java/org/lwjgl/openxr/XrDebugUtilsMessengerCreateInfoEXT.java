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
 * Debug utils messenger create info.
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code userCallback} <b>must</b> be a valid PFN_xrDebugUtilsMessengerCallbackEXT</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link EXTDebugUtils XR_EXT_debug_utils} extension <b>must</b> be enabled prior to using {@link XrDebugUtilsMessengerCreateInfoEXT}</li>
 * <li>{@code type} <b>must</b> be {@link EXTDebugUtils#XR_TYPE_DEBUG_UTILS_MESSENGER_CREATE_INFO_EXT TYPE_DEBUG_UTILS_MESSENGER_CREATE_INFO_EXT}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * <li>{@code messageSeverities} <b>must</b> be a valid combination of {@code XrDebugUtilsMessageSeverityFlagBitsEXT} values</li>
 * <li>{@code messageSeverities} <b>must</b> not be 0</li>
 * <li>{@code messageTypes} <b>must</b> be a valid combination of {@code XrDebugUtilsMessageTypeFlagBitsEXT} values</li>
 * <li>{@code messageTypes} <b>must</b> not be 0</li>
 * <li>{@code userCallback} <b>must</b> be a valid {@link XrDebugUtilsMessengerCallbackEXT} value</li>
 * </ul>
 * 
 * <p>For each {@code XrDebugUtilsMessengerEXT} that is created the {@link XrDebugUtilsMessengerCreateInfoEXT}{@code ::messageSeverities} and {@link XrDebugUtilsMessengerCreateInfoEXT}{@code ::messageTypes} determine when that {@link XrDebugUtilsMessengerCreateInfoEXT}{@code ::userCallback} is called. The process to determine if the user’s userCallback is triggered when an event occurs is as follows:</p>
 * 
 * <ul>
 * <li>The runtime will perform a bitwise AND of the event’s {@code XrDebugUtilsMessageSeverityFlagBitsEXT} with the {@link XrDebugUtilsMessengerCreateInfoEXT}{@code ::messageSeverities} provided during creation of the {@code XrDebugUtilsMessengerEXT} object.</li>
 * <li>If this results in 0, the message is skipped.</li>
 * <li>The runtime will perform bitwise AND of the event’s {@code XrDebugUtilsMessageTypeFlagBitsEXT} with the {@link XrDebugUtilsMessengerCreateInfoEXT}{@code ::messageTypes} provided during the creation of the {@code XrDebugUtilsMessengerEXT} object.</li>
 * <li>If this results in 0, the message is skipped.</li>
 * <li>If the message of the current event is not skipped, the callback will be called with the message.</li>
 * </ul>
 * 
 * <p>The callback will come directly from the component that detected the event, unless some other layer intercepts the calls for its own purposes (filter them in a different way, log to a system error log, etc.).</p>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XrDebugUtilsMessengerCallbackEXT}, {@link EXTDebugUtils#xrCreateDebugUtilsMessengerEXT CreateDebugUtilsMessengerEXT}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrDebugUtilsMessengerCreateInfoEXT {
 *     XrStructureType {@link #type};
 *     void const * {@link #next};
 *     XrDebugUtilsMessageSeverityFlagsEXT {@link #messageSeverities};
 *     XrDebugUtilsMessageTypeFlagsEXT {@link #messageTypes};
 *     {@link XrDebugUtilsMessengerCallbackEXTI PFN_xrDebugUtilsMessengerCallbackEXT} {@link #userCallback};
 *     void * {@link #userData};
 * }</code></pre>
 */
public class XrDebugUtilsMessengerCreateInfoEXT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        MESSAGESEVERITIES,
        MESSAGETYPES,
        USERCALLBACK,
        USERDATA;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(8),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        MESSAGESEVERITIES = layout.offsetof(2);
        MESSAGETYPES = layout.offsetof(3);
        USERCALLBACK = layout.offsetof(4);
        USERDATA = layout.offsetof(5);
    }

    /**
     * Creates a {@code XrDebugUtilsMessengerCreateInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrDebugUtilsMessengerCreateInfoEXT(ByteBuffer container) {
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
    /** a bitmask of {@code XrDebugUtilsMessageSeverityFlagBitsEXT} specifying which severity of event(s) that will cause this callback to be called. */
    @NativeType("XrDebugUtilsMessageSeverityFlagsEXT")
    public long messageSeverities() { return nmessageSeverities(address()); }
    /** a combination of {@code XrDebugUtilsMessageTypeFlagBitsEXT} specifying which type of event(s) will cause this callback to be called. */
    @NativeType("XrDebugUtilsMessageTypeFlagsEXT")
    public long messageTypes() { return nmessageTypes(address()); }
    /** the application defined callback function to call. */
    @NativeType("PFN_xrDebugUtilsMessengerCallbackEXT")
    public XrDebugUtilsMessengerCallbackEXT userCallback() { return nuserCallback(address()); }
    /** arbitrary user data to be passed to the callback. */
    @NativeType("void *")
    public long userData() { return nuserData(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrDebugUtilsMessengerCreateInfoEXT type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link EXTDebugUtils#XR_TYPE_DEBUG_UTILS_MESSENGER_CREATE_INFO_EXT TYPE_DEBUG_UTILS_MESSENGER_CREATE_INFO_EXT} value to the {@link #type} field. */
    public XrDebugUtilsMessengerCreateInfoEXT type$Default() { return type(EXTDebugUtils.XR_TYPE_DEBUG_UTILS_MESSENGER_CREATE_INFO_EXT); }
    /** Sets the specified value to the {@link #next} field. */
    public XrDebugUtilsMessengerCreateInfoEXT next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@link #messageSeverities} field. */
    public XrDebugUtilsMessengerCreateInfoEXT messageSeverities(@NativeType("XrDebugUtilsMessageSeverityFlagsEXT") long value) { nmessageSeverities(address(), value); return this; }
    /** Sets the specified value to the {@link #messageTypes} field. */
    public XrDebugUtilsMessengerCreateInfoEXT messageTypes(@NativeType("XrDebugUtilsMessageTypeFlagsEXT") long value) { nmessageTypes(address(), value); return this; }
    /** Sets the specified value to the {@link #userCallback} field. */
    public XrDebugUtilsMessengerCreateInfoEXT userCallback(@NativeType("PFN_xrDebugUtilsMessengerCallbackEXT") XrDebugUtilsMessengerCallbackEXTI value) { nuserCallback(address(), value); return this; }
    /** Sets the specified value to the {@link #userData} field. */
    public XrDebugUtilsMessengerCreateInfoEXT userData(@NativeType("void *") long value) { nuserData(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrDebugUtilsMessengerCreateInfoEXT set(
        int type,
        long next,
        long messageSeverities,
        long messageTypes,
        XrDebugUtilsMessengerCallbackEXTI userCallback,
        long userData
    ) {
        type(type);
        next(next);
        messageSeverities(messageSeverities);
        messageTypes(messageTypes);
        userCallback(userCallback);
        userData(userData);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrDebugUtilsMessengerCreateInfoEXT set(XrDebugUtilsMessengerCreateInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrDebugUtilsMessengerCreateInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrDebugUtilsMessengerCreateInfoEXT malloc() {
        return wrap(XrDebugUtilsMessengerCreateInfoEXT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XrDebugUtilsMessengerCreateInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrDebugUtilsMessengerCreateInfoEXT calloc() {
        return wrap(XrDebugUtilsMessengerCreateInfoEXT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XrDebugUtilsMessengerCreateInfoEXT} instance allocated with {@link BufferUtils}. */
    public static XrDebugUtilsMessengerCreateInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XrDebugUtilsMessengerCreateInfoEXT.class, memAddress(container), container);
    }

    /** Returns a new {@code XrDebugUtilsMessengerCreateInfoEXT} instance for the specified memory address. */
    public static XrDebugUtilsMessengerCreateInfoEXT create(long address) {
        return wrap(XrDebugUtilsMessengerCreateInfoEXT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrDebugUtilsMessengerCreateInfoEXT createSafe(long address) {
        return address == NULL ? null : wrap(XrDebugUtilsMessengerCreateInfoEXT.class, address);
    }

    /**
     * Returns a new {@link XrDebugUtilsMessengerCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrDebugUtilsMessengerCreateInfoEXT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrDebugUtilsMessengerCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrDebugUtilsMessengerCreateInfoEXT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrDebugUtilsMessengerCreateInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrDebugUtilsMessengerCreateInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XrDebugUtilsMessengerCreateInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrDebugUtilsMessengerCreateInfoEXT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrDebugUtilsMessengerCreateInfoEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code XrDebugUtilsMessengerCreateInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrDebugUtilsMessengerCreateInfoEXT malloc(MemoryStack stack) {
        return wrap(XrDebugUtilsMessengerCreateInfoEXT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XrDebugUtilsMessengerCreateInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrDebugUtilsMessengerCreateInfoEXT calloc(MemoryStack stack) {
        return wrap(XrDebugUtilsMessengerCreateInfoEXT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XrDebugUtilsMessengerCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrDebugUtilsMessengerCreateInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrDebugUtilsMessengerCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrDebugUtilsMessengerCreateInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrDebugUtilsMessengerCreateInfoEXT.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrDebugUtilsMessengerCreateInfoEXT.NEXT); }
    /** Unsafe version of {@link #messageSeverities}. */
    public static long nmessageSeverities(long struct) { return UNSAFE.getLong(null, struct + XrDebugUtilsMessengerCreateInfoEXT.MESSAGESEVERITIES); }
    /** Unsafe version of {@link #messageTypes}. */
    public static long nmessageTypes(long struct) { return UNSAFE.getLong(null, struct + XrDebugUtilsMessengerCreateInfoEXT.MESSAGETYPES); }
    /** Unsafe version of {@link #userCallback}. */
    public static XrDebugUtilsMessengerCallbackEXT nuserCallback(long struct) { return XrDebugUtilsMessengerCallbackEXT.create(memGetAddress(struct + XrDebugUtilsMessengerCreateInfoEXT.USERCALLBACK)); }
    /** Unsafe version of {@link #userData}. */
    public static long nuserData(long struct) { return memGetAddress(struct + XrDebugUtilsMessengerCreateInfoEXT.USERDATA); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrDebugUtilsMessengerCreateInfoEXT.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrDebugUtilsMessengerCreateInfoEXT.NEXT, value); }
    /** Unsafe version of {@link #messageSeverities(long) messageSeverities}. */
    public static void nmessageSeverities(long struct, long value) { UNSAFE.putLong(null, struct + XrDebugUtilsMessengerCreateInfoEXT.MESSAGESEVERITIES, value); }
    /** Unsafe version of {@link #messageTypes(long) messageTypes}. */
    public static void nmessageTypes(long struct, long value) { UNSAFE.putLong(null, struct + XrDebugUtilsMessengerCreateInfoEXT.MESSAGETYPES, value); }
    /** Unsafe version of {@link #userCallback(XrDebugUtilsMessengerCallbackEXTI) userCallback}. */
    public static void nuserCallback(long struct, XrDebugUtilsMessengerCallbackEXTI value) { memPutAddress(struct + XrDebugUtilsMessengerCreateInfoEXT.USERCALLBACK, value.address()); }
    /** Unsafe version of {@link #userData(long) userData}. */
    public static void nuserData(long struct, long value) { memPutAddress(struct + XrDebugUtilsMessengerCreateInfoEXT.USERDATA, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrDebugUtilsMessengerCreateInfoEXT.USERCALLBACK));
    }

    // -----------------------------------

    /** An array of {@link XrDebugUtilsMessengerCreateInfoEXT} structs. */
    public static class Buffer extends StructBuffer<XrDebugUtilsMessengerCreateInfoEXT, Buffer> implements NativeResource {

        private static final XrDebugUtilsMessengerCreateInfoEXT ELEMENT_FACTORY = XrDebugUtilsMessengerCreateInfoEXT.create(-1L);

        /**
         * Creates a new {@code XrDebugUtilsMessengerCreateInfoEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrDebugUtilsMessengerCreateInfoEXT#SIZEOF}, and its mark will be undefined.
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
        protected XrDebugUtilsMessengerCreateInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrDebugUtilsMessengerCreateInfoEXT#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrDebugUtilsMessengerCreateInfoEXT.ntype(address()); }
        /** @return the value of the {@link XrDebugUtilsMessengerCreateInfoEXT#next} field. */
        @NativeType("void const *")
        public long next() { return XrDebugUtilsMessengerCreateInfoEXT.nnext(address()); }
        /** @return the value of the {@link XrDebugUtilsMessengerCreateInfoEXT#messageSeverities} field. */
        @NativeType("XrDebugUtilsMessageSeverityFlagsEXT")
        public long messageSeverities() { return XrDebugUtilsMessengerCreateInfoEXT.nmessageSeverities(address()); }
        /** @return the value of the {@link XrDebugUtilsMessengerCreateInfoEXT#messageTypes} field. */
        @NativeType("XrDebugUtilsMessageTypeFlagsEXT")
        public long messageTypes() { return XrDebugUtilsMessengerCreateInfoEXT.nmessageTypes(address()); }
        /** @return the value of the {@link XrDebugUtilsMessengerCreateInfoEXT#userCallback} field. */
        @NativeType("PFN_xrDebugUtilsMessengerCallbackEXT")
        public XrDebugUtilsMessengerCallbackEXT userCallback() { return XrDebugUtilsMessengerCreateInfoEXT.nuserCallback(address()); }
        /** @return the value of the {@link XrDebugUtilsMessengerCreateInfoEXT#userData} field. */
        @NativeType("void *")
        public long userData() { return XrDebugUtilsMessengerCreateInfoEXT.nuserData(address()); }

        /** Sets the specified value to the {@link XrDebugUtilsMessengerCreateInfoEXT#type} field. */
        public XrDebugUtilsMessengerCreateInfoEXT.Buffer type(@NativeType("XrStructureType") int value) { XrDebugUtilsMessengerCreateInfoEXT.ntype(address(), value); return this; }
        /** Sets the {@link EXTDebugUtils#XR_TYPE_DEBUG_UTILS_MESSENGER_CREATE_INFO_EXT TYPE_DEBUG_UTILS_MESSENGER_CREATE_INFO_EXT} value to the {@link XrDebugUtilsMessengerCreateInfoEXT#type} field. */
        public XrDebugUtilsMessengerCreateInfoEXT.Buffer type$Default() { return type(EXTDebugUtils.XR_TYPE_DEBUG_UTILS_MESSENGER_CREATE_INFO_EXT); }
        /** Sets the specified value to the {@link XrDebugUtilsMessengerCreateInfoEXT#next} field. */
        public XrDebugUtilsMessengerCreateInfoEXT.Buffer next(@NativeType("void const *") long value) { XrDebugUtilsMessengerCreateInfoEXT.nnext(address(), value); return this; }
        /** Sets the specified value to the {@link XrDebugUtilsMessengerCreateInfoEXT#messageSeverities} field. */
        public XrDebugUtilsMessengerCreateInfoEXT.Buffer messageSeverities(@NativeType("XrDebugUtilsMessageSeverityFlagsEXT") long value) { XrDebugUtilsMessengerCreateInfoEXT.nmessageSeverities(address(), value); return this; }
        /** Sets the specified value to the {@link XrDebugUtilsMessengerCreateInfoEXT#messageTypes} field. */
        public XrDebugUtilsMessengerCreateInfoEXT.Buffer messageTypes(@NativeType("XrDebugUtilsMessageTypeFlagsEXT") long value) { XrDebugUtilsMessengerCreateInfoEXT.nmessageTypes(address(), value); return this; }
        /** Sets the specified value to the {@link XrDebugUtilsMessengerCreateInfoEXT#userCallback} field. */
        public XrDebugUtilsMessengerCreateInfoEXT.Buffer userCallback(@NativeType("PFN_xrDebugUtilsMessengerCallbackEXT") XrDebugUtilsMessengerCallbackEXTI value) { XrDebugUtilsMessengerCreateInfoEXT.nuserCallback(address(), value); return this; }
        /** Sets the specified value to the {@link XrDebugUtilsMessengerCreateInfoEXT#userData} field. */
        public XrDebugUtilsMessengerCreateInfoEXT.Buffer userData(@NativeType("void *") long value) { XrDebugUtilsMessengerCreateInfoEXT.nuserData(address(), value); return this; }

    }

}