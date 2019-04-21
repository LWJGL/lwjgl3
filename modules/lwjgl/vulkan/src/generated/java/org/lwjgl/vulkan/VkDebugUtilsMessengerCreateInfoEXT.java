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
 * Structure specifying parameters of a newly created debug messenger.
 * 
 * <h5>Description</h5>
 * 
 * <p>For each {@code VkDebugUtilsMessengerEXT} that is created the {@link VkDebugUtilsMessengerCreateInfoEXT}{@code ::messageSeverity} and {@link VkDebugUtilsMessengerCreateInfoEXT}{@code ::messageType} determine when that {@link VkDebugUtilsMessengerCreateInfoEXT}{@code ::pfnUserCallback} is called. The process to determine if the user's {@code pfnUserCallback} is triggered when an event occurs is as follows:</p>
 * 
 * <ul>
 * <li>The implementation will perform a bitwise AND of the event&#8217;s {@code VkDebugUtilsMessageSeverityFlagBitsEXT} with the {@code messageSeverity} provided during creation of the {@code VkDebugUtilsMessengerEXT} object.
 * 
 * <ul>
 * <li>If the value is 0, the message is skipped.</li>
 * </ul>
 * </li>
 * <li>The implementation will perform bitwise AND of the event&#8217;s {@code VkDebugUtilsMessageTypeFlagBitsEXT} with the {@code messageType} provided during the creation of the {@code VkDebugUtilsMessengerEXT} object.
 * 
 * <ul>
 * <li>If the value is 0, the message is skipped.</li>
 * </ul>
 * </li>
 * <li>The callback will trigger a debug message for the current event</li>
 * </ul>
 * 
 * <p>The callback will come directly from the component that detected the event, unless some other layer intercepts the calls for its own purposes (filter them in a different way, log to a system error log, etc.).</p>
 * 
 * <p>An application <b>can</b> receive multiple callbacks if multiple {@code VkDebugUtilsMessengerEXT} objects are created. A callback will always be executed in the same thread as the originating Vulkan call.</p>
 * 
 * <p>A callback <b>can</b> be called from multiple threads simultaneously (if the application is making Vulkan calls from multiple threads).</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code pfnUserCallback} <b>must</b> be a valid {@link VkDebugUtilsMessengerCallbackEXT}</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTDebugUtils#VK_STRUCTURE_TYPE_DEBUG_UTILS_MESSENGER_CREATE_INFO_EXT STRUCTURE_TYPE_DEBUG_UTILS_MESSENGER_CREATE_INFO_EXT}</li>
 * <li>{@code flags} <b>must</b> be 0</li>
 * <li>{@code messageSeverity} <b>must</b> be a valid combination of {@code VkDebugUtilsMessageSeverityFlagBitsEXT} values</li>
 * <li>{@code messageSeverity} <b>must</b> not be 0</li>
 * <li>{@code messageType} <b>must</b> be a valid combination of {@code VkDebugUtilsMessageTypeFlagBitsEXT} values</li>
 * <li>{@code messageType} <b>must</b> not be 0</li>
 * <li>{@code pfnUserCallback} <b>must</b> be a valid {@link VkDebugUtilsMessengerCallbackEXT} value</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkDebugUtilsMessengerCallbackEXT}, {@link EXTDebugUtils#vkCreateDebugUtilsMessengerEXT CreateDebugUtilsMessengerEXT}</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code flags} &ndash; 0 and reserved for future use.</li>
 * <li>{@code messageSeverity} &ndash; a bitmask of {@code VkDebugUtilsMessageSeverityFlagBitsEXT} specifying which severity of event(s) will cause this callback to be called.</li>
 * <li>{@code messageType} &ndash; a bitmask of {@code VkDebugUtilsMessageTypeFlagBitsEXT} specifying which type of event(s) will cause this callback to be called.</li>
 * <li>{@code pfnUserCallback} &ndash; the application callback function to call.</li>
 * <li>{@code pUserData} &ndash; user data to be passed to the callback.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkDebugUtilsMessengerCreateInfoEXT {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkDebugUtilsMessengerCreateFlagsEXT flags;
 *     VkDebugUtilsMessageSeverityFlagsEXT messageSeverity;
 *     VkDebugUtilsMessageTypeFlagsEXT messageType;
 *     {@link VkDebugUtilsMessengerCallbackEXTI PFN_vkDebugUtilsMessengerCallbackEXT} pfnUserCallback;
 *     void * pUserData;
 * }</code></pre>
 */
public class VkDebugUtilsMessengerCreateInfoEXT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FLAGS,
        MESSAGESEVERITY,
        MESSAGETYPE,
        PFNUSERCALLBACK,
        PUSERDATA;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        MESSAGESEVERITY = layout.offsetof(3);
        MESSAGETYPE = layout.offsetof(4);
        PFNUSERCALLBACK = layout.offsetof(5);
        PUSERDATA = layout.offsetof(6);
    }

    /**
     * Creates a {@code VkDebugUtilsMessengerCreateInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDebugUtilsMessengerCreateInfoEXT(ByteBuffer container) {
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
    /** Returns the value of the {@code flags} field. */
    @NativeType("VkDebugUtilsMessengerCreateFlagsEXT")
    public int flags() { return nflags(address()); }
    /** Returns the value of the {@code messageSeverity} field. */
    @NativeType("VkDebugUtilsMessageSeverityFlagsEXT")
    public int messageSeverity() { return nmessageSeverity(address()); }
    /** Returns the value of the {@code messageType} field. */
    @NativeType("VkDebugUtilsMessageTypeFlagsEXT")
    public int messageType() { return nmessageType(address()); }
    /** Returns the value of the {@code pfnUserCallback} field. */
    @NativeType("PFN_vkDebugUtilsMessengerCallbackEXT")
    public VkDebugUtilsMessengerCallbackEXT pfnUserCallback() { return npfnUserCallback(address()); }
    /** Returns the value of the {@code pUserData} field. */
    @NativeType("void *")
    public long pUserData() { return npUserData(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkDebugUtilsMessengerCreateInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkDebugUtilsMessengerCreateInfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code flags} field. */
    public VkDebugUtilsMessengerCreateInfoEXT flags(@NativeType("VkDebugUtilsMessengerCreateFlagsEXT") int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@code messageSeverity} field. */
    public VkDebugUtilsMessengerCreateInfoEXT messageSeverity(@NativeType("VkDebugUtilsMessageSeverityFlagsEXT") int value) { nmessageSeverity(address(), value); return this; }
    /** Sets the specified value to the {@code messageType} field. */
    public VkDebugUtilsMessengerCreateInfoEXT messageType(@NativeType("VkDebugUtilsMessageTypeFlagsEXT") int value) { nmessageType(address(), value); return this; }
    /** Sets the specified value to the {@code pfnUserCallback} field. */
    public VkDebugUtilsMessengerCreateInfoEXT pfnUserCallback(@NativeType("PFN_vkDebugUtilsMessengerCallbackEXT") VkDebugUtilsMessengerCallbackEXTI value) { npfnUserCallback(address(), value); return this; }
    /** Sets the specified value to the {@code pUserData} field. */
    public VkDebugUtilsMessengerCreateInfoEXT pUserData(@NativeType("void *") long value) { npUserData(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkDebugUtilsMessengerCreateInfoEXT set(
        int sType,
        long pNext,
        int flags,
        int messageSeverity,
        int messageType,
        VkDebugUtilsMessengerCallbackEXTI pfnUserCallback,
        long pUserData
    ) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        messageSeverity(messageSeverity);
        messageType(messageType);
        pfnUserCallback(pfnUserCallback);
        pUserData(pUserData);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkDebugUtilsMessengerCreateInfoEXT set(VkDebugUtilsMessengerCreateInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkDebugUtilsMessengerCreateInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDebugUtilsMessengerCreateInfoEXT malloc() {
        return wrap(VkDebugUtilsMessengerCreateInfoEXT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkDebugUtilsMessengerCreateInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDebugUtilsMessengerCreateInfoEXT calloc() {
        return wrap(VkDebugUtilsMessengerCreateInfoEXT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkDebugUtilsMessengerCreateInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkDebugUtilsMessengerCreateInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkDebugUtilsMessengerCreateInfoEXT.class, memAddress(container), container);
    }

    /** Returns a new {@code VkDebugUtilsMessengerCreateInfoEXT} instance for the specified memory address. */
    public static VkDebugUtilsMessengerCreateInfoEXT create(long address) {
        return wrap(VkDebugUtilsMessengerCreateInfoEXT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDebugUtilsMessengerCreateInfoEXT createSafe(long address) {
        return address == NULL ? null : wrap(VkDebugUtilsMessengerCreateInfoEXT.class, address);
    }

    /**
     * Returns a new {@link VkDebugUtilsMessengerCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDebugUtilsMessengerCreateInfoEXT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkDebugUtilsMessengerCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDebugUtilsMessengerCreateInfoEXT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDebugUtilsMessengerCreateInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDebugUtilsMessengerCreateInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkDebugUtilsMessengerCreateInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDebugUtilsMessengerCreateInfoEXT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDebugUtilsMessengerCreateInfoEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code VkDebugUtilsMessengerCreateInfoEXT} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkDebugUtilsMessengerCreateInfoEXT mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code VkDebugUtilsMessengerCreateInfoEXT} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkDebugUtilsMessengerCreateInfoEXT callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code VkDebugUtilsMessengerCreateInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDebugUtilsMessengerCreateInfoEXT mallocStack(MemoryStack stack) {
        return wrap(VkDebugUtilsMessengerCreateInfoEXT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkDebugUtilsMessengerCreateInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDebugUtilsMessengerCreateInfoEXT callocStack(MemoryStack stack) {
        return wrap(VkDebugUtilsMessengerCreateInfoEXT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkDebugUtilsMessengerCreateInfoEXT.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDebugUtilsMessengerCreateInfoEXT.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkDebugUtilsMessengerCreateInfoEXT.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkDebugUtilsMessengerCreateInfoEXT.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkDebugUtilsMessengerCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDebugUtilsMessengerCreateInfoEXT.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDebugUtilsMessengerCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDebugUtilsMessengerCreateInfoEXT.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkDebugUtilsMessengerCreateInfoEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkDebugUtilsMessengerCreateInfoEXT.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return UNSAFE.getInt(null, struct + VkDebugUtilsMessengerCreateInfoEXT.FLAGS); }
    /** Unsafe version of {@link #messageSeverity}. */
    public static int nmessageSeverity(long struct) { return UNSAFE.getInt(null, struct + VkDebugUtilsMessengerCreateInfoEXT.MESSAGESEVERITY); }
    /** Unsafe version of {@link #messageType}. */
    public static int nmessageType(long struct) { return UNSAFE.getInt(null, struct + VkDebugUtilsMessengerCreateInfoEXT.MESSAGETYPE); }
    /** Unsafe version of {@link #pfnUserCallback}. */
    public static VkDebugUtilsMessengerCallbackEXT npfnUserCallback(long struct) { return VkDebugUtilsMessengerCallbackEXT.create(memGetAddress(struct + VkDebugUtilsMessengerCreateInfoEXT.PFNUSERCALLBACK)); }
    /** Unsafe version of {@link #pUserData}. */
    public static long npUserData(long struct) { return memGetAddress(struct + VkDebugUtilsMessengerCreateInfoEXT.PUSERDATA); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkDebugUtilsMessengerCreateInfoEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkDebugUtilsMessengerCreateInfoEXT.PNEXT, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { UNSAFE.putInt(null, struct + VkDebugUtilsMessengerCreateInfoEXT.FLAGS, value); }
    /** Unsafe version of {@link #messageSeverity(int) messageSeverity}. */
    public static void nmessageSeverity(long struct, int value) { UNSAFE.putInt(null, struct + VkDebugUtilsMessengerCreateInfoEXT.MESSAGESEVERITY, value); }
    /** Unsafe version of {@link #messageType(int) messageType}. */
    public static void nmessageType(long struct, int value) { UNSAFE.putInt(null, struct + VkDebugUtilsMessengerCreateInfoEXT.MESSAGETYPE, value); }
    /** Unsafe version of {@link #pfnUserCallback(VkDebugUtilsMessengerCallbackEXTI) pfnUserCallback}. */
    public static void npfnUserCallback(long struct, VkDebugUtilsMessengerCallbackEXTI value) { memPutAddress(struct + VkDebugUtilsMessengerCreateInfoEXT.PFNUSERCALLBACK, value.address()); }
    /** Unsafe version of {@link #pUserData(long) pUserData}. */
    public static void npUserData(long struct, long value) { memPutAddress(struct + VkDebugUtilsMessengerCreateInfoEXT.PUSERDATA, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + VkDebugUtilsMessengerCreateInfoEXT.PFNUSERCALLBACK));
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

    /** An array of {@link VkDebugUtilsMessengerCreateInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkDebugUtilsMessengerCreateInfoEXT, Buffer> implements NativeResource {

        private static final VkDebugUtilsMessengerCreateInfoEXT ELEMENT_FACTORY = VkDebugUtilsMessengerCreateInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkDebugUtilsMessengerCreateInfoEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDebugUtilsMessengerCreateInfoEXT#SIZEOF}, and its mark will be undefined.
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
        protected VkDebugUtilsMessengerCreateInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkDebugUtilsMessengerCreateInfoEXT.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkDebugUtilsMessengerCreateInfoEXT.npNext(address()); }
        /** Returns the value of the {@code flags} field. */
        @NativeType("VkDebugUtilsMessengerCreateFlagsEXT")
        public int flags() { return VkDebugUtilsMessengerCreateInfoEXT.nflags(address()); }
        /** Returns the value of the {@code messageSeverity} field. */
        @NativeType("VkDebugUtilsMessageSeverityFlagsEXT")
        public int messageSeverity() { return VkDebugUtilsMessengerCreateInfoEXT.nmessageSeverity(address()); }
        /** Returns the value of the {@code messageType} field. */
        @NativeType("VkDebugUtilsMessageTypeFlagsEXT")
        public int messageType() { return VkDebugUtilsMessengerCreateInfoEXT.nmessageType(address()); }
        /** Returns the value of the {@code pfnUserCallback} field. */
        @NativeType("PFN_vkDebugUtilsMessengerCallbackEXT")
        public VkDebugUtilsMessengerCallbackEXT pfnUserCallback() { return VkDebugUtilsMessengerCreateInfoEXT.npfnUserCallback(address()); }
        /** Returns the value of the {@code pUserData} field. */
        @NativeType("void *")
        public long pUserData() { return VkDebugUtilsMessengerCreateInfoEXT.npUserData(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkDebugUtilsMessengerCreateInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkDebugUtilsMessengerCreateInfoEXT.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkDebugUtilsMessengerCreateInfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkDebugUtilsMessengerCreateInfoEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code flags} field. */
        public VkDebugUtilsMessengerCreateInfoEXT.Buffer flags(@NativeType("VkDebugUtilsMessengerCreateFlagsEXT") int value) { VkDebugUtilsMessengerCreateInfoEXT.nflags(address(), value); return this; }
        /** Sets the specified value to the {@code messageSeverity} field. */
        public VkDebugUtilsMessengerCreateInfoEXT.Buffer messageSeverity(@NativeType("VkDebugUtilsMessageSeverityFlagsEXT") int value) { VkDebugUtilsMessengerCreateInfoEXT.nmessageSeverity(address(), value); return this; }
        /** Sets the specified value to the {@code messageType} field. */
        public VkDebugUtilsMessengerCreateInfoEXT.Buffer messageType(@NativeType("VkDebugUtilsMessageTypeFlagsEXT") int value) { VkDebugUtilsMessengerCreateInfoEXT.nmessageType(address(), value); return this; }
        /** Sets the specified value to the {@code pfnUserCallback} field. */
        public VkDebugUtilsMessengerCreateInfoEXT.Buffer pfnUserCallback(@NativeType("PFN_vkDebugUtilsMessengerCallbackEXT") VkDebugUtilsMessengerCallbackEXTI value) { VkDebugUtilsMessengerCreateInfoEXT.npfnUserCallback(address(), value); return this; }
        /** Sets the specified value to the {@code pUserData} field. */
        public VkDebugUtilsMessengerCreateInfoEXT.Buffer pUserData(@NativeType("void *") long value) { VkDebugUtilsMessengerCreateInfoEXT.npUserData(address(), value); return this; }

    }

}