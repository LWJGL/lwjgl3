/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/** The MSFT_controller_model extension. */
public class MSFTControllerModel {

    /** The extension specification version. */
    public static final int XR_MSFT_controller_model_SPEC_VERSION = 2;

    /** The extension name. */
    public static final String XR_MSFT_CONTROLLER_MODEL_EXTENSION_NAME = "XR_MSFT_controller_model";

    /** XR_MAX_CONTROLLER_MODEL_NODE_NAME_SIZE_MSFT */
    public static final int XR_MAX_CONTROLLER_MODEL_NODE_NAME_SIZE_MSFT = 64;

    /**
     * Extends {@code XrStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #XR_TYPE_CONTROLLER_MODEL_KEY_STATE_MSFT TYPE_CONTROLLER_MODEL_KEY_STATE_MSFT}</li>
     * <li>{@link #XR_TYPE_CONTROLLER_MODEL_NODE_PROPERTIES_MSFT TYPE_CONTROLLER_MODEL_NODE_PROPERTIES_MSFT}</li>
     * <li>{@link #XR_TYPE_CONTROLLER_MODEL_PROPERTIES_MSFT TYPE_CONTROLLER_MODEL_PROPERTIES_MSFT}</li>
     * <li>{@link #XR_TYPE_CONTROLLER_MODEL_NODE_STATE_MSFT TYPE_CONTROLLER_MODEL_NODE_STATE_MSFT}</li>
     * <li>{@link #XR_TYPE_CONTROLLER_MODEL_STATE_MSFT TYPE_CONTROLLER_MODEL_STATE_MSFT}</li>
     * </ul>
     */
    public static final int
        XR_TYPE_CONTROLLER_MODEL_KEY_STATE_MSFT       = 1000055000,
        XR_TYPE_CONTROLLER_MODEL_NODE_PROPERTIES_MSFT = 1000055001,
        XR_TYPE_CONTROLLER_MODEL_PROPERTIES_MSFT      = 1000055002,
        XR_TYPE_CONTROLLER_MODEL_NODE_STATE_MSFT      = 1000055003,
        XR_TYPE_CONTROLLER_MODEL_STATE_MSFT           = 1000055004;

    /** Extends {@code XrResult}. */
    public static final int XR_ERROR_CONTROLLER_MODEL_KEY_INVALID_MSFT = -1000055000;

    /** API Constants */
    public static final long XR_NULL_CONTROLLER_MODEL_KEY_MSFT = 0x0L;

    protected MSFTControllerModel() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrGetControllerModelKeyMSFT ] ---

    /** Unsafe version of: {@link #xrGetControllerModelKeyMSFT GetControllerModelKeyMSFT} */
    public static int nxrGetControllerModelKeyMSFT(XrSession session, long topLevelUserPath, long controllerModelKeyState) {
        long __functionAddress = session.getCapabilities().xrGetControllerModelKeyMSFT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPI(session.address(), topLevelUserPath, controllerModelKeyState, __functionAddress);
    }

    /**
     * Retrieve the model key for the controller.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>{@link #xrGetControllerModelKeyMSFT GetControllerModelKeyMSFT} retrieves the {@code XrControllerModelKeyMSFT} for a controller. This model key <b>may</b> later be used to retrieve the model data.</p>
     * 
     * <p>The {@link #xrGetControllerModelKeyMSFT GetControllerModelKeyMSFT} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrGetControllerModelKeyMSFT(
     *     XrSession                                   session,
     *     XrPath                                      topLevelUserPath,
     *     XrControllerModelKeyStateMSFT*              controllerModelKeyState);</code></pre>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link MSFTControllerModel XR_MSFT_controller_model} extension <b>must</b> be enabled prior to calling {@link #xrGetControllerModelKeyMSFT GetControllerModelKeyMSFT}</li>
     * <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
     * <li>{@code controllerModelKeyState} <b>must</b> be a pointer to an {@link XrControllerModelKeyStateMSFT} structure</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link XR10#XR_SUCCESS SUCCESS}</li>
     * <li>{@link XR10#XR_SESSION_LOSS_PENDING SESSION_LOSS_PENDING}</li>
     * </ul></dd>
     * <dt>On failure, this command returns</dt>
     * <dd><ul>
     * <li>{@link XR10#XR_ERROR_FUNCTION_UNSUPPORTED ERROR_FUNCTION_UNSUPPORTED}</li>
     * <li>{@link XR10#XR_ERROR_VALIDATION_FAILURE ERROR_VALIDATION_FAILURE}</li>
     * <li>{@link XR10#XR_ERROR_HANDLE_INVALID ERROR_HANDLE_INVALID}</li>
     * <li>{@link XR10#XR_ERROR_INSTANCE_LOST ERROR_INSTANCE_LOST}</li>
     * <li>{@link XR10#XR_ERROR_SESSION_LOST ERROR_SESSION_LOST}</li>
     * <li>{@link XR10#XR_ERROR_OUT_OF_MEMORY ERROR_OUT_OF_MEMORY}</li>
     * <li>{@link XR10#XR_ERROR_PATH_UNSUPPORTED ERROR_PATH_UNSUPPORTED}</li>
     * <li>{@link XR10#XR_ERROR_PATH_INVALID ERROR_PATH_INVALID}</li>
     * <li>{@link #XR_ERROR_CONTROLLER_MODEL_KEY_INVALID_MSFT ERROR_CONTROLLER_MODEL_KEY_INVALID_MSFT}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrControllerModelKeyStateMSFT}</p>
     *
     * @param session                 the specified {@code XrSession}.
     * @param topLevelUserPath        the top level user path corresponding to the controller render model being queried (e.g. pathname:/user/hand/left or pathname:/user/hand/right).
     * @param controllerModelKeyState a pointer to the {@link XrControllerModelKeyStateMSFT} to write the model key state to.
     */
    @NativeType("XrResult")
    public static int xrGetControllerModelKeyMSFT(XrSession session, @NativeType("XrPath") long topLevelUserPath, @NativeType("XrControllerModelKeyStateMSFT *") XrControllerModelKeyStateMSFT controllerModelKeyState) {
        return nxrGetControllerModelKeyMSFT(session, topLevelUserPath, controllerModelKeyState.address());
    }

    // --- [ xrLoadControllerModelMSFT ] ---

    /**
     * Unsafe version of: {@link #xrLoadControllerModelMSFT LoadControllerModelMSFT}
     *
     * @param bufferCapacityInput the capacity of the {@code buffer} array, or 0 to indicate a request to retrieve the required capacity.
     */
    public static int nxrLoadControllerModelMSFT(XrSession session, long modelKey, int bufferCapacityInput, long bufferCountOutput, long buffer) {
        long __functionAddress = session.getCapabilities().xrLoadControllerModelMSFT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPPI(session.address(), modelKey, bufferCapacityInput, bufferCountOutput, buffer, __functionAddress);
    }

    /**
     * Load controller render model.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrLoadControllerModelMSFT LoadControllerModelMSFT} function loads the controller model as a byte buffer containing a binary form of glTF (a.k.a GLB file format) for the controller. The binary glTF data <b>must</b> conform to glTF 2.0 format defined at <a target="_blank" href="https://github.com/KhronosGroup/glTF/tree/master/specification/2.0">https://github.com/KhronosGroup/glTF/tree/master/specification/2.0</a>.</p>
     * 
     * <pre><code>
     * XrResult xrLoadControllerModelMSFT(
     *     XrSession                                   session,
     *     XrControllerModelKeyMSFT                    modelKey,
     *     uint32_t                                    bufferCapacityInput,
     *     uint32_t*                                   bufferCountOutput,
     *     uint8_t*                                    buffer);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>The {@link #xrLoadControllerModelMSFT LoadControllerModelMSFT} function <b>may</b> be a slow operation and therefore <b>should</b> be invoked from a non-timing critical thread.</p>
     * 
     * <p>If the input {@code modelKey} is invalid, i.e. it is {@link #XR_NULL_CONTROLLER_MODEL_KEY_MSFT NULL_CONTROLLER_MODEL_KEY_MSFT} or not a key returned from {@link XrControllerModelKeyStateMSFT}, the runtime <b>must</b> return {@link #XR_ERROR_CONTROLLER_MODEL_KEY_INVALID_MSFT ERROR_CONTROLLER_MODEL_KEY_INVALID_MSFT}.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link MSFTControllerModel XR_MSFT_controller_model} extension <b>must</b> be enabled prior to calling {@link #xrLoadControllerModelMSFT LoadControllerModelMSFT}</li>
     * <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
     * <li>{@code bufferCountOutput} <b>must</b> be a pointer to a {@code uint32_t} value</li>
     * <li>If {@code bufferCapacityInput} is not 0, {@code buffer} <b>must</b> be a pointer to an array of {@code bufferCapacityInput} {@code uint8_t} values</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link XR10#XR_SUCCESS SUCCESS}</li>
     * <li>{@link XR10#XR_SESSION_LOSS_PENDING SESSION_LOSS_PENDING}</li>
     * </ul></dd>
     * <dt>On failure, this command returns</dt>
     * <dd><ul>
     * <li>{@link XR10#XR_ERROR_FUNCTION_UNSUPPORTED ERROR_FUNCTION_UNSUPPORTED}</li>
     * <li>{@link XR10#XR_ERROR_VALIDATION_FAILURE ERROR_VALIDATION_FAILURE}</li>
     * <li>{@link XR10#XR_ERROR_HANDLE_INVALID ERROR_HANDLE_INVALID}</li>
     * <li>{@link XR10#XR_ERROR_INSTANCE_LOST ERROR_INSTANCE_LOST}</li>
     * <li>{@link XR10#XR_ERROR_SESSION_LOST ERROR_SESSION_LOST}</li>
     * <li>{@link XR10#XR_ERROR_OUT_OF_MEMORY ERROR_OUT_OF_MEMORY}</li>
     * <li>{@link XR10#XR_ERROR_SIZE_INSUFFICIENT ERROR_SIZE_INSUFFICIENT}</li>
     * <li>{@link #XR_ERROR_CONTROLLER_MODEL_KEY_INVALID_MSFT ERROR_CONTROLLER_MODEL_KEY_INVALID_MSFT}</li>
     * </ul></dd>
     * </dl>
     *
     * @param session           the specified {@code XrSession}.
     * @param modelKey          the model key corresponding to the controller render model being queried.
     * @param bufferCountOutput filled in by the runtime with the count of elements in {@code buffer} array, or returns the required capacity in the case that {@code bufferCapacityInput} is 0.
     * @param buffer            a pointer to an application-allocated array of the model for the device that will be filled with the {@code uint8_t} values by the runtime. It <b>can</b> be {@code NULL} if {@code bufferCapacityInput} is 0.
     */
    @NativeType("XrResult")
    public static int xrLoadControllerModelMSFT(XrSession session, @NativeType("XrControllerModelKeyMSFT") long modelKey, @NativeType("uint32_t *") IntBuffer bufferCountOutput, @Nullable @NativeType("uint8_t *") ByteBuffer buffer) {
        if (CHECKS) {
            check(bufferCountOutput, 1);
        }
        return nxrLoadControllerModelMSFT(session, modelKey, remainingSafe(buffer), memAddress(bufferCountOutput), memAddressSafe(buffer));
    }

    // --- [ xrGetControllerModelPropertiesMSFT ] ---

    /** Unsafe version of: {@link #xrGetControllerModelPropertiesMSFT GetControllerModelPropertiesMSFT} */
    public static int nxrGetControllerModelPropertiesMSFT(XrSession session, long modelKey, long properties) {
        long __functionAddress = session.getCapabilities().xrGetControllerModelPropertiesMSFT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPI(session.address(), modelKey, properties, __functionAddress);
    }

    /**
     * Get controller model properties.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrGetControllerModelPropertiesMSFT GetControllerModelPropertiesMSFT} function returns the controller model properties for a given {@code modelKey}.</p>
     * 
     * <pre><code>
     * XrResult xrGetControllerModelPropertiesMSFT(
     *     XrSession                                   session,
     *     XrControllerModelKeyMSFT                    modelKey,
     *     XrControllerModelPropertiesMSFT*            properties);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>The runtime <b>must</b> return the same data in {@link XrControllerModelPropertiesMSFT} for a valid {@code modelKey}. Therefore, the application <b>can</b> cache the returned {@link XrControllerModelPropertiesMSFT} using {@code modelKey} and reuse the data for each frame.</p>
     * 
     * <p>If the input {@code modelKey} is invalid, i.e. it is {@link #XR_NULL_CONTROLLER_MODEL_KEY_MSFT NULL_CONTROLLER_MODEL_KEY_MSFT} or not a key returned from {@link XrControllerModelKeyStateMSFT}, the runtime <b>must</b> return {@link #XR_ERROR_CONTROLLER_MODEL_KEY_INVALID_MSFT ERROR_CONTROLLER_MODEL_KEY_INVALID_MSFT}.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link MSFTControllerModel XR_MSFT_controller_model} extension <b>must</b> be enabled prior to calling {@link #xrGetControllerModelPropertiesMSFT GetControllerModelPropertiesMSFT}</li>
     * <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
     * <li>{@code properties} <b>must</b> be a pointer to an {@link XrControllerModelPropertiesMSFT} structure</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link XR10#XR_SUCCESS SUCCESS}</li>
     * <li>{@link XR10#XR_SESSION_LOSS_PENDING SESSION_LOSS_PENDING}</li>
     * </ul></dd>
     * <dt>On failure, this command returns</dt>
     * <dd><ul>
     * <li>{@link XR10#XR_ERROR_FUNCTION_UNSUPPORTED ERROR_FUNCTION_UNSUPPORTED}</li>
     * <li>{@link XR10#XR_ERROR_VALIDATION_FAILURE ERROR_VALIDATION_FAILURE}</li>
     * <li>{@link XR10#XR_ERROR_HANDLE_INVALID ERROR_HANDLE_INVALID}</li>
     * <li>{@link XR10#XR_ERROR_INSTANCE_LOST ERROR_INSTANCE_LOST}</li>
     * <li>{@link XR10#XR_ERROR_SESSION_LOST ERROR_SESSION_LOST}</li>
     * <li>{@link XR10#XR_ERROR_OUT_OF_MEMORY ERROR_OUT_OF_MEMORY}</li>
     * <li>{@link #XR_ERROR_CONTROLLER_MODEL_KEY_INVALID_MSFT ERROR_CONTROLLER_MODEL_KEY_INVALID_MSFT}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrControllerModelPropertiesMSFT}</p>
     *
     * @param session    the specified {@code XrSession}.
     * @param modelKey   a valid model key obtained from {@link XrControllerModelKeyStateMSFT}
     * @param properties an {@link XrControllerModelPropertiesMSFT} returning the properties of the controller model
     */
    @NativeType("XrResult")
    public static int xrGetControllerModelPropertiesMSFT(XrSession session, @NativeType("XrControllerModelKeyMSFT") long modelKey, @NativeType("XrControllerModelPropertiesMSFT *") XrControllerModelPropertiesMSFT properties) {
        return nxrGetControllerModelPropertiesMSFT(session, modelKey, properties.address());
    }

    // --- [ xrGetControllerModelStateMSFT ] ---

    /** Unsafe version of: {@link #xrGetControllerModelStateMSFT GetControllerModelStateMSFT} */
    public static int nxrGetControllerModelStateMSFT(XrSession session, long modelKey, long state) {
        long __functionAddress = session.getCapabilities().xrGetControllerModelStateMSFT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPI(session.address(), modelKey, state, __functionAddress);
    }

    /**
     * Get controller model state.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrGetControllerModelStateMSFT GetControllerModelStateMSFT} function returns the current state of the controller model representing user’s interaction to the controller, such as pressing a button or pulling a trigger.</p>
     * 
     * <pre><code>
     * XrResult xrGetControllerModelStateMSFT(
     *     XrSession                                   session,
     *     XrControllerModelKeyMSFT                    modelKey,
     *     XrControllerModelStateMSFT*                 state);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>The runtime <b>may</b> return different state for a model key after each call to {@link XR10#xrSyncActions SyncActions}, which represents the latest state of the user interactions.</p>
     * 
     * <p>If the input {@code modelKey} is invalid, i.e. it is {@link #XR_NULL_CONTROLLER_MODEL_KEY_MSFT NULL_CONTROLLER_MODEL_KEY_MSFT} or not a key returned from {@link XrControllerModelKeyStateMSFT}, the runtime <b>must</b> return {@link #XR_ERROR_CONTROLLER_MODEL_KEY_INVALID_MSFT ERROR_CONTROLLER_MODEL_KEY_INVALID_MSFT}.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link MSFTControllerModel XR_MSFT_controller_model} extension <b>must</b> be enabled prior to calling {@link #xrGetControllerModelStateMSFT GetControllerModelStateMSFT}</li>
     * <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
     * <li>{@code state} <b>must</b> be a pointer to an {@link XrControllerModelStateMSFT} structure</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link XR10#XR_SUCCESS SUCCESS}</li>
     * <li>{@link XR10#XR_SESSION_LOSS_PENDING SESSION_LOSS_PENDING}</li>
     * </ul></dd>
     * <dt>On failure, this command returns</dt>
     * <dd><ul>
     * <li>{@link XR10#XR_ERROR_FUNCTION_UNSUPPORTED ERROR_FUNCTION_UNSUPPORTED}</li>
     * <li>{@link XR10#XR_ERROR_VALIDATION_FAILURE ERROR_VALIDATION_FAILURE}</li>
     * <li>{@link XR10#XR_ERROR_HANDLE_INVALID ERROR_HANDLE_INVALID}</li>
     * <li>{@link XR10#XR_ERROR_INSTANCE_LOST ERROR_INSTANCE_LOST}</li>
     * <li>{@link XR10#XR_ERROR_SESSION_LOST ERROR_SESSION_LOST}</li>
     * <li>{@link XR10#XR_ERROR_OUT_OF_MEMORY ERROR_OUT_OF_MEMORY}</li>
     * <li>{@link #XR_ERROR_CONTROLLER_MODEL_KEY_INVALID_MSFT ERROR_CONTROLLER_MODEL_KEY_INVALID_MSFT}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrControllerModelStateMSFT}</p>
     *
     * @param session  the specified {@code XrSession}.
     * @param modelKey the model key corresponding to the controller model being queried.
     * @param state    a pointer to {@link XrControllerModelNodeStateMSFT} returns the current controller model state.
     */
    @NativeType("XrResult")
    public static int xrGetControllerModelStateMSFT(XrSession session, @NativeType("XrControllerModelKeyMSFT") long modelKey, @NativeType("XrControllerModelStateMSFT *") XrControllerModelStateMSFT state) {
        return nxrGetControllerModelStateMSFT(session, modelKey, state.address());
    }

}