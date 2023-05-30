from abc import ABC, abstractmethod

class Cliente(ABC):
    
   @abstractmethod 
   def m1():
       pass
   
   @abstractmethod 
   def m2():
       pass
   
   @abstractmethod 
   def m3():
       pass
   
   @abstractmethod 
   def m4():
       pass
   
   @abstractmethod 
   def m5():
       pass
   
   @abstractmethod 
   def m6():
       pass


class _ClienteJuri(Cliente):
     
   def m1():
       print("M1 cliente juridico\n")
   
   def m2():
       print("M2 cliente juridico\n")
     
   def m3():
       print("M3 cliente juridico\n")
   
   def m4():
       print("M4 cliente juridico\n")
   
   def m5():
       print("M5 cliente juridico\n")
   
   def m6():
       print("M6 cliente juridico\n")
       
       
class _ClienteFisico(Cliente):
     
   def m1():
       print("M1 cliente fisico\n")
   
   def m2():
       print("M2 cliente fisico\n")
     
   def m3():
       print("M3 cliente fisico\n")
   
   def m4():
       print("M4 cliente fisico\n")
   
   def m5():
       print("M5 cliente fisico\n")
   
   def m6():
       print("M6 cliente fisico\n")
       
class factory():
    
    def cria_juri():
        cj = _ClienteJuri()
        return cj
    
    def cria_fisic():
        cf = _ClienteFisico()
        return cf
        
    