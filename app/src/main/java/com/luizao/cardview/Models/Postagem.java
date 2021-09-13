package com.luizao.cardview.Models;

public class Postagem {

   private String username;
   private String post;
   private int img;
   private String horario;



   public Postagem() {
   }

   public Postagem(String username, String post, int img, String horario) {
      this.username = username;
      this.post = post;
      this.img = img;
      this.horario = horario;
   }


   public String getUsername() {
      return username;
   }

   public void setUsername(String username) {
      this.username = username;
   }

   public String getHorario() {
      return horario;
   }

   public void setHorario(String horario) {
      this.horario = horario;
   }

   public String getPost() {
      return post;
   }

   public void setPost(String post) {
      this.post = post;
   }

   public int getImg() {
      return img;
   }

   public void setImg(int img) {
      this.img = img;
   }
}
