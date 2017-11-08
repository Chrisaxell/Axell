package sample;
import java.awt.*;
import javax.swing.*;
import com.jogamp.opengl.GL2;
import com.jogamp.opengl.glu.GLU;
import com.jogamp.opengl.GLAutoDrawable;
import com.jogamp.opengl.GLEventListener;
import com.jogamp.opengl.awt.GLCanvas;

public class Ovning14 extends GLCanvas implements GLEventListener {

    private static String TITLE = "Ovning 13!!! del 1";
    private static final int CANVAS_WIDTH = 800;
    private static final int CANVAS_HEIGHT = 800;

    static final float cornerPositions[][] = {{1,1,1},{-1,1,1},{-1,-1,1},{1,-1,1},{1,1,-1},{-1,1,-1},{-1,-1,-1},{1,-1,-1}};
    static final float color[][] = {{1,0,0},{0,1,0},{0,0,1},{0,0,0},{1,1,0},{1,0,1},{0,1,1},{1,1,1}};

    private GLU glu;

    public Ovning14() {
        this.addGLEventListener(this);
    }

    public void drawSide(GL2 gl, int a, int b, int c, int d){
        gl.glColor3fv(color[a],0);
        gl.glBegin(GL2.GL_POLYGON);
            gl.glVertex3fv(cornerPositions[a],0);
            gl.glVertex3fv(cornerPositions[b],0);
            gl.glVertex3fv(cornerPositions[c],0);
            gl.glVertex3fv(cornerPositions[d],0);
        gl.glEnd();
    }

    public void drawCube(GL2 gl){
           drawSide(gl, 0,1,2,3);
           drawSide(gl, 3,0,7,4);
           drawSide(gl, 2,3,7,6);
           drawSide(gl, 1,0,4,5);
           drawSide(gl, 5,1,2,6);
           drawSide(gl, 4,5,6,7);
    }


    public void init(GLAutoDrawable drawable) {
        GL2 gl = drawable.getGL().getGL2();
        glu = new GLU();
        gl.glClearColor(0.0f, 5.0f, 5.0f, 0.0f);
        gl.glEnable(GL2.GL_DEPTH_TEST);
        gl.glHint(GL2.GL_PERSPECTIVE_CORRECTION_HINT, GL2.GL_NICEST);
    }

    public void reshape(GLAutoDrawable drawable, int x, int y, int width, int height) {
        GL2 gl = drawable.getGL().getGL2();

        if (height == 0) height = 1;
        float aspect = (float)width / height;

        gl.glMatrixMode(GL2.GL_PROJECTION);
        gl.glLoadIdentity();
        glu.gluPerspective(45.0, aspect, 0.1, 100.0);

        gl.glMatrixMode(GL2.GL_MODELVIEW);
        gl.glLoadIdentity(); // reset
    }

    public void display(GLAutoDrawable drawable) {
        GL2 gl = drawable.getGL().getGL2();
        gl.glClear(GL2.GL_COLOR_BUFFER_BIT | GL2.GL_DEPTH_BUFFER_BIT);
        gl.glLoadIdentity();

        gl.glTranslatef(0.0f, 0.0f,-10.0f);

        gl.glViewport(0,0,CANVAS_WIDTH/2,CANVAS_HEIGHT/2);
        drawCube(gl);

        gl.glViewport(CANVAS_WIDTH/2,0,CANVAS_WIDTH/2,CANVAS_HEIGHT/2);
        gl.glRotatef(70,1,0,1);
        drawCube(gl);

        gl.glViewport(CANVAS_WIDTH/2,CANVAS_HEIGHT/2,CANVAS_WIDTH/2,CANVAS_HEIGHT/2);
        gl.glRotatef(70,0,1,1);
        drawCube(gl);

        gl.glViewport(0,CANVAS_HEIGHT/2,CANVAS_WIDTH/2,CANVAS_HEIGHT/2);
        gl.glRotatef(45,1,1,0);
        drawCube(gl);
    }

    public void dispose(GLAutoDrawable drawable) { }



    public static void main(String[] args) {
        GLCanvas canvas = new Ovning14();
        canvas.setPreferredSize(new Dimension(CANVAS_WIDTH, CANVAS_HEIGHT));

        final JFrame frame = new JFrame();
        frame.getContentPane().add(canvas);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setTitle(TITLE);
        frame.pack();
        frame.setVisible(true);
    }
}
