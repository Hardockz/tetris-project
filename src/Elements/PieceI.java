/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Elements;

import util.ImageLoader;

/**
 *
 * @author ju
 */
public class PieceI extends Element {
    
    public PieceI() {
        super();
        this.image = ImageLoader.loadImage("/pieceI.png");
        setMatrix();
    }
    
    private void setMatrix(){
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                this.m[i][j] = j==2;
            }
        }
    }
}