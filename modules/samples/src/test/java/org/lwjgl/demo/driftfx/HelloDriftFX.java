/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.demo.driftfx;

import javafx.application.*;
import javafx.scene.*;
import javafx.scene.input.*;
import javafx.scene.layout.*;
import javafx.scene.paint.*;
import javafx.stage.*;
import org.eclipse.fx.drift.*;
import org.lwjgl.*;
import org.lwjgl.demo.opengl.*;
import org.lwjgl.opengl.*;
import org.lwjgl.system.*;

import java.nio.*;
import java.util.concurrent.*;
import java.util.concurrent.atomic.*;

import static org.lwjgl.driftfx.DriftFX.*;
import static org.lwjgl.opengl.GL32C.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

public class HelloDriftFX extends Application {

    private final AtomicBoolean  aliveFlag = new AtomicBoolean(true);
    private final CountDownLatch exitLatch = new CountDownLatch(1);

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        DriftFXSurface.initialize();

        BorderPane root = new BorderPane();

        DriftFXSurface surface = new DriftFXSurface();
        root.setCenter(surface);

        Scene scene = new Scene(root);
        scene.setFill(Color.BLACK);
        scene.getAccelerators().put(
            new KeyCodeCombination(KeyCode.ESCAPE),
            () -> primaryStage.fireEvent(new WindowEvent(primaryStage, WindowEvent.WINDOW_CLOSE_REQUEST))
        );

        primaryStage.setScene(scene);

        primaryStage.setWidth(300);
        primaryStage.setHeight(300);
        primaryStage.show();
        primaryStage.setTitle("DriftFX Gears");
        primaryStage.addEventFilter(WindowEvent.WINDOW_CLOSE_REQUEST, windowEvent -> {
            // notify render thread that we're exiting
            aliveFlag.set(false);
            try {
                // block until render thread has cleaned up
                exitLatch.await();
            } catch (InterruptedException ignored) {
            }
        });

        new RenderThread(
            aliveFlag,
            exitLatch,
            surface.getNativeSurfaceHandle()
        ).start();
    }

    private static class RenderThread extends Thread {

        private final AtomicBoolean  aliveFlag;
        private final CountDownLatch exitLatch;

        private final long surface;

        private final long transferMode;

        private long context;

        private int fbo;
        private int rbo;

        private GLXGears gears;

        private int width;
        private int height;

        RenderThread(AtomicBoolean aliveFlag, CountDownLatch exitLatch, long surfaceId) {
            super("HelloDriftFX-Render-Thread");

            this.aliveFlag = aliveFlag;
            this.exitLatch = exitLatch;

            this.surface = driftfxGetSurface(driftfxGet(), surfaceId);

            long transferMode = driftfxSurfaceGetPlatformDefaultTransferMode();
            try (MemoryStack stack = stackPush()) {
                PointerBuffer modes = stack.mallocPointer((int)driftfxSurfaceGetAvailableTransferModes(null));
                driftfxSurfaceGetAvailableTransferModes(modes);
                for (int i = 0; i < modes.limit(); i++) {
                    long mode = modes.get(i);
                    try (MemoryStack frame = stack.push()) {
                        ByteBuffer name = frame.malloc((int)driftfxTransferModeName(mode, null));
                        driftfxTransferModeName(mode, name);
                        if (memASCII(name).startsWith("NVDX")) {
                            transferMode = mode;
                        }
                    }
                }
            }
            this.transferMode = transferMode;
        }

        @Override public void run() {
            initGLState();
            renderLoop();
            cleanup();
        }

        private void initGLState() {
            driftfxSurfaceInitialize(surface);

            context = driftfxSurfaceGetContext(surface);
            driftfxGLContextSetCurrent(context);

            try (MemoryStack frame = stackPush()) {
                ByteBuffer name = frame.malloc((int)driftfxGLContextGetName(context, null));
                driftfxGLContextGetName(context, name);
                System.out.println("GLContext name: " + memASCII(name));
            }

            GL.createCapabilities();

            this.fbo = glGenFramebuffers();
            this.rbo = glGenRenderbuffers();

            glBindFramebuffer(GL_FRAMEBUFFER, fbo);
            checkFBOSize();
            glFramebufferRenderbuffer(GL_FRAMEBUFFER, GL_DEPTH_ATTACHMENT, GL_RENDERBUFFER, rbo);
            glBindFramebuffer(GL_FRAMEBUFFER, 0);

            this.gears = new GLXGears();
        }

        private void renderLoop() {
            while (aliveFlag.get()) {
                checkFBOSize();

                long target = driftfxSurfaceAcquire(surface, width, height, transferMode);

                glBindFramebuffer(GL_FRAMEBUFFER, fbo);
                glFramebufferTexture(GL_FRAMEBUFFER, GL_COLOR_ATTACHMENT0, driftfxRenderTargetGetGLTexture(target), 0);

                gears.setSize(width, height);
                gears.render();
                gears.animate();

                glFlush();

                glBindFramebuffer(GL_FRAMEBUFFER, 0);

                driftfxSurfacePresent(surface, target, DRIFTFX_CENTER);
            }
        }

        private void cleanup() {
            glDeleteRenderbuffers(rbo);
            glDeleteFramebuffers(fbo);

            GL.setCapabilities(null);

            driftfxSurfaceCleanup(surface);
            driftfxGLContextUnsetCurrent(context);


            exitLatch.countDown();
        }

        private void checkFBOSize() {
            int width  = driftfxSurfaceGetWidth(surface);
            int height = driftfxSurfaceGetHeight(surface);

            if (width != this.width || height != this.height) {
                this.width = width;
                this.height = height;
                glBindRenderbuffer(GL_RENDERBUFFER, rbo);
                glRenderbufferStorage(GL_RENDERBUFFER, GL_DEPTH_COMPONENT, this.width, this.height);
                glBindRenderbuffer(GL_RENDERBUFFER, 0);
            }
        }

    }

}