package com.zjy.cost;

import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

import static org.objectweb.asm.Opcodes.ALOAD;
import static org.objectweb.asm.Opcodes.ASTORE;
import static org.objectweb.asm.Opcodes.CHECKCAST;
import static org.objectweb.asm.Opcodes.DUP;
import static org.objectweb.asm.Opcodes.GETFIELD;
import static org.objectweb.asm.Opcodes.GETSTATIC;
import static org.objectweb.asm.Opcodes.GOTO;
import static org.objectweb.asm.Opcodes.IFEQ;
import static org.objectweb.asm.Opcodes.IFNULL;
import static org.objectweb.asm.Opcodes.INSTANCEOF;
import static org.objectweb.asm.Opcodes.INVOKESPECIAL;
import static org.objectweb.asm.Opcodes.INVOKESTATIC;
import static org.objectweb.asm.Opcodes.INVOKEVIRTUAL;
import static org.objectweb.asm.Opcodes.NEW;
import static org.objectweb.asm.Opcodes.POP;
import static org.objectweb.asm.Opcodes.RETURN;

/**
 * @author gavin
 * @date 2019/2/19
 */
public class GlideMethodVisitor extends MethodVisitor {

    public GlideMethodVisitor(MethodVisitor mv) {
        super(Opcodes.ASM5, mv);
    }

    @Override
    public void visitCode() {
        super.visitCode();
        //方法执行前插入
        mv.visitVarInsn(ALOAD, 1);
        Label label1 = new Label();
        mv.visitJumpInsn(IFNULL, label1);
        Label label2 = new Label();
        mv.visitLabel(label2);
        mv.visitLineNumber(36, label2);
        mv.visitVarInsn(ALOAD, 1);
        mv.visitTypeInsn(INSTANCEOF, "android/graphics/drawable/BitmapDrawable");
        mv.visitJumpInsn(IFEQ, label1);
        Label label3 = new Label();
        mv.visitLabel(label3);
        mv.visitLineNumber(37, label3);
        mv.visitVarInsn(ALOAD, 1);
        mv.visitTypeInsn(CHECKCAST, "android/graphics/drawable/BitmapDrawable");
        mv.visitMethodInsn(INVOKEVIRTUAL, "android/graphics/drawable/BitmapDrawable", "getBitmap", "()Landroid/graphics/Bitmap;", false);
        mv.visitVarInsn(ASTORE, 2);
        Label label4 = new Label();
        mv.visitLabel(label4);
        mv.visitLineNumber(38, label4);
        mv.visitVarInsn(ALOAD, 2);
        Label label5 = new Label();
        mv.visitJumpInsn(IFNULL, label5);
        Label label6 = new Label();
        mv.visitLabel(label6);
        mv.visitLineNumber(39, label6);
        mv.visitLdcInsn("asm------------");
        mv.visitTypeInsn(NEW, "java/lang/StringBuilder");
        mv.visitInsn(DUP);
        mv.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
        mv.visitLdcInsn("setResource width: ");
        mv.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
        mv.visitVarInsn(ALOAD, 1);
        mv.visitTypeInsn(CHECKCAST, "android/graphics/drawable/BitmapDrawable");
        mv.visitMethodInsn(INVOKEVIRTUAL, "android/graphics/drawable/BitmapDrawable", "getBitmap", "()Landroid/graphics/Bitmap;", false);
        mv.visitMethodInsn(INVOKEVIRTUAL, "android/graphics/Bitmap", "getWidth", "()I", false);
        mv.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(I)Ljava/lang/StringBuilder;", false);
        mv.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
        mv.visitMethodInsn(INVOKESTATIC, "android/util/Log", "d", "(Ljava/lang/String;Ljava/lang/String;)I", false);
        mv.visitInsn(POP);
        Label label7 = new Label();
        mv.visitLabel(label7);
        mv.visitLineNumber(40, label7);
        mv.visitLdcInsn("asm------------");
        mv.visitTypeInsn(NEW, "java/lang/StringBuilder");
        mv.visitInsn(DUP);
        mv.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
        mv.visitLdcInsn("setResource height: ");
        mv.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
        mv.visitVarInsn(ALOAD, 1);
        mv.visitTypeInsn(CHECKCAST, "android/graphics/drawable/BitmapDrawable");
        mv.visitMethodInsn(INVOKEVIRTUAL, "android/graphics/drawable/BitmapDrawable", "getBitmap", "()Landroid/graphics/Bitmap;", false);
        mv.visitMethodInsn(INVOKEVIRTUAL, "android/graphics/Bitmap", "getHeight", "()I", false);
        mv.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(I)Ljava/lang/StringBuilder;", false);
        mv.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
        mv.visitMethodInsn(INVOKESTATIC, "android/util/Log", "d", "(Ljava/lang/String;Ljava/lang/String;)I", false);
        mv.visitInsn(POP);
        mv.visitJumpInsn(GOTO, label1);
        mv.visitLabel(label5);
        mv.visitLineNumber(42, label5);
        mv.visitFrame(Opcodes.F_APPEND, 1, new Object[]{"android/graphics/Bitmap"}, 0, null);
        mv.visitLdcInsn("asm------------");
        mv.visitLdcInsn("setResource bitmap null");
        mv.visitMethodInsn(INVOKESTATIC, "android/util/Log", "d", "(Ljava/lang/String;Ljava/lang/String;)I", false);
        mv.visitInsn(POP);
        mv.visitLabel(label1);
        mv.visitLineNumber(46, label1);
        mv.visitFrame(Opcodes.F_CHOP, 1, null, 0, null);
    }

    @Override
    public void visitInsn(int opcode) {
        //方法执行后插入
        /*if (opcode == Opcodes.RETURN) {
            mv.visitLdcInsn("TAG");
            mv.visitTypeInsn(Opcodes.NEW, "java/lang/StringBuilder");
            mv.visitInsn(Opcodes.DUP);
            mv.visitMethodInsn(Opcodes.INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
            mv.visitLdcInsn("-------> onCreate : end ：");
            mv.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
            mv.visitVarInsn(Opcodes.ALOAD, 0);
            mv.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/lang/Object", "getClass", "()Ljava/lang/Class;", false);
            mv.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/lang/Class", "getSimpleName", "()Ljava/lang/String;", false);
            mv.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
            mv.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
            mv.visitMethodInsn(Opcodes.INVOKESTATIC, "android/util/Log", "i", "(Ljava/lang/String;Ljava/lang/String;)I", false);
            mv.visitInsn(Opcodes.POP);
        }*/
        super.visitInsn(opcode);
    }
}
